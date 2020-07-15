/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;


import KONEKSI.koneksi;
import MODEL.datapeminjaman;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class c_datapeminjaman {
    private Connection conn = null;

    public c_datapeminjaman(Connection con) {
        this.conn = con;
    }
    public boolean inputdatapeminjaman(datapeminjaman pin) {
        boolean vali = false;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_pinjam(idpinjam,idpeminjam,idbuku,tglpinjam,tglkembali,denda) VALUES(?,?,?,?,?,?)");

            ps.setInt(1, pin.getIdpinjam());
            ps.setInt(2, pin.getIdpeminjam());
            ps.setInt(3, pin.getIdbuku());
            ps.setString(4, pin.getTgl1());
            ps.setString(5, pin.getTgl2());
            ps.setString(6, pin.getDenda());
            
          
            if (ps.executeUpdate() > 0) {
                vali = true;
            }
        } catch (Exception e) {
        }
        return vali;
  } 
 public List<datapeminjaman> getdatapeminjaman() {
        List<datapeminjaman> get = new ArrayList();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareCall("SELECT * FROM tb_pinjam");
            rs = ps.executeQuery();
            while (rs.next()) {
                datapeminjaman pin= new datapeminjaman();
                pin.setIdpinjam(rs.getInt(1));
                pin.setIdpeminjam(rs.getInt(2));
                pin.setIdbuku(rs.getInt(3));
                pin.setTgl1(rs.getString(4));
                pin.setTgl2(rs.getString(5));
                pin.setDenda(rs.getString(6));
                
                get.add(pin);
            }
        } catch (Exception e) {
        }
        return get;
    }
  public String hapus(String id) {
        String hasil = "tidak berhasil hapus";
        String query = "DELETE FROM tb_pinjam WHERE idpinjam='" + id + "'";
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
     public String Updatedatapeminjaman(int idpinjam,int idpeminjams,int idbukus, String tgl1, String tgl2, String dendas) {
        String hasil = "tidak berhasil update";
        String sql = "UPDATE tb_pinjam SET idpeminjam='" + idpeminjams + "',idbuku='" + idbukus + "',tglpinjam='" + tgl1 + "', tglkembali= '" + tgl2 + "', denda= '" + dendas + "' WHERE idpinjam = " + idpinjam;
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
     public List<datapeminjaman> cari(int idpeminjam)throws SQLException {//menselect tabel yang sesuai dengan id yang dicari
          List<datapeminjaman> get = new ArrayList();
        String sql="select * from tb_pinjam where idpeminjam like ?";
        PreparedStatement ps;
        ResultSet rs;
        
           ps = conn.prepareStatement(sql);
            ps.setInt(1, idpeminjam);
            rs = ps.executeQuery();
            while (rs.next()) {
                datapeminjaman pin= new datapeminjaman();
                pin.setIdpinjam(rs.getInt(1));
                pin.setIdpeminjam(rs.getInt(2));
                pin.setIdbuku(rs.getInt(3));
                pin.setTgl1(rs.getString(4));
                pin.setTgl2(rs.getString(5));
                pin.setDenda(rs.getString(6));
                
                get.add(pin);
            }
        
        return get;
       
            
      
     }
    
    
 
}
 
