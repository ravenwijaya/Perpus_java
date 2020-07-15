/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import MODEL.buku;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;//mengimport library java

/**
 *
 * @author x.x
 */
public class c_buku {
 private Connection conn = null;

    public c_buku(Connection con) {
        this.conn = con;//koneksi
    
}
    public boolean inputbuku(buku buk) {
        boolean vali = false;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_buku(idbuku,judul,jum,penulis,penerbit,tahunterbit) VALUES(?,?,?,?,?,?)");
//value belum diketahui=?
            ps.setInt(1, buk.getIdbuku());
            ps.setString(2, buk.getJudul());
            ps.setInt(3, buk.getJumlah());
            ps.setString(4, buk.getPenulis());
            ps.setString(5, buk.getPenerbit());
            ps.setString(6, buk.getTahunterbit());
            
          
            if (ps.executeUpdate() > 0) {
                vali = true;
            }
        } catch (Exception e) {
        }
        return vali;
  } //inputbuku mengambil data yang ada di tabelbuku lalu dimasukan ke database tb_buku
    
     public List<buku> getbuku() {//mengambil data yang ada di tb_buku
        List<buku> get = new ArrayList();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareCall("SELECT * FROM tb_buku") ;//select semua kolom dari tb_buku yang ada di database lalu dimasukan ke list
            rs = ps.executeQuery();
            while (rs.next()) {
                buku buk = new buku();
                buk.setIdbuku(rs.getInt(1));
                buk.setJudul(rs.getString(2));
                buk.setJumlah(rs.getInt(3));
                buk.setPenulis(rs.getString(4));
                buk.setPenerbit(rs.getString(5));
                buk.setTahunterbit(rs.getString(6));
                
                get.add(buk);
            }
        } catch (Exception e) {//menagkap eror
        }
        return get;
    } public String hapus(String id) {
        String hasil = "tidak berhasil hapus";//menghapus data di tb_buku dimana idbuku yang ada di tb_buku= idbuku yang diinput
        String query = "DELETE FROM tb_buku WHERE idbuku='" + id + "'";
        Statement st;
        try {
            st = conn.createStatement();
            if (st.executeUpdate(query) > 0) {
                hasil = "berhasil hapus";
            }
        } catch (Exception e) {
        }
        return hasil;
    }public String Updatebuku(int idbuku, String judul, String penulis, String penerbit, String tahunterbit,int jum) {
        String hasil = "tidak berhasil update";//mengupdate tb_buku sesuai dengan atribut diatas
        String sql = "UPDATE tb_buku SET judul='" + judul + "',penulis='" + penulis + "', penerbit= '" + penerbit + "', tahunterbit= '" + tahunterbit + "', jum= '" + jum + "' WHERE idbuku = " + idbuku;
        Statement st;
        try {
            st = conn.createStatement();
            if (st.executeUpdate(sql) > 0) {
                hasil = "berhasil update";
            }
        } catch (Exception e) {
        }
        return hasil;//mengembalikan 
    }
    
   
}
