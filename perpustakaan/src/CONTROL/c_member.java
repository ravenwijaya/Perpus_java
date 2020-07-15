/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import MODEL.member;
import KONEKSI.koneksi;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class c_member {
    private Connection conn = null;

    public c_member(Connection con) {
        this.conn = con;
    }
    public boolean inputmember(member mem) {
        boolean vali = false;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_peminjam(idpeminjam,nama,tgllahir,alamat,nohp) VALUES(?,?,?,?,?)");

            ps.setInt(1, mem.getIdpeminjam());
            ps.setString(2, mem.getNama());
            ps.setString(3, mem.getTgllahir());
            ps.setString(4, mem.getAlamat());
            ps.setString(5, mem.getNoHp());
          
            if (ps.executeUpdate() > 0) {
                vali = true;
            }
        } catch (Exception e) {
        }
        return vali;
  } 
 public List<member> getmember() {
        List<member> get = new ArrayList();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareCall("SELECT * FROM tb_peminjam");
            rs = ps.executeQuery();
            while (rs.next()) {
                member mem = new member();
                mem.setIdpeminjam(rs.getInt(1));
                mem.setNama(rs.getString(2));
                mem.setTgllahir(rs.getString(3));
                mem.setAlamat(rs.getString(4));
                mem.setNoHp(rs.getString(5));
                
                get.add(mem);
            }
        } catch (Exception e) {
        }
        return get;
    }
  public String hapus(String id) {
        String hasil = "tidak berhasil hapus";
        String query = "DELETE FROM tb_peminjam WHERE idpeminjam='" + id + "'";
        Statement st;
        try {
            st = conn.createStatement();
            if (st.executeUpdate(query) > 0) {
                hasil = "berhasil hapus";
            }
        } catch (Exception e) {
        }
        return hasil;
    }
     public String Updatemember(int idpeminjam, String nama, String tgllahir, String alamat, String nohp) {
        String hasil = "tidak berhasil update";
        String sql = "UPDATE tb_peminjam SET nama='" + nama + "',tgllahir='" + tgllahir + "', alamat= '" + alamat + "', Nohp= '" + nohp + "' WHERE idpeminjam = " + idpeminjam;
        Statement st;
        try {
            st = conn.createStatement();
            if (st.executeUpdate(sql) > 0) {
                hasil = "berhasil update";
            }
        } catch (Exception e) {
        }
        return hasil;
    }
     
 
}
 
