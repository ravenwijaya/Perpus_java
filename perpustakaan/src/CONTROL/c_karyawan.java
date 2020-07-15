/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;


import KONEKSI.koneksi;
import MODEL.karyawan;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class c_karyawan {
    private Connection conn = null;

    public c_karyawan(Connection con) {
        this.conn = con;
    }
    public boolean inputkaryawan(karyawan kar) {
        boolean vali = false;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_karyawan(username,password,idkaryawan,nama,tgllahir,alamat,nohp,jeniskel) VALUES(?,?,?,?,?,?,?,?)");

            ps.setString(1, kar.getUsername());
            ps.setString(2, kar.getPassword());
            ps.setInt(3, kar.getIdkaryawan());
            ps.setString(4, kar.getNama());
            ps.setString(5, kar.getTgllahir());
            ps.setString(6, kar.getAlamat());
            ps.setString(7, kar.getNohp());
            ps.setString(8, kar.getJeniskel());
          
            if (ps.executeUpdate() > 0) {
                vali = true;
            }
        } catch (Exception e) {
        }
        return vali;
  } 
 public List<karyawan> getkaryawan() {
        List<karyawan> get = new ArrayList();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareCall("SELECT * FROM tb_karyawan ");
            rs = ps.executeQuery();
            while (rs.next()) {
                karyawan kar = new karyawan();
                kar.setUsername(rs.getString(1));
                kar.setPassword(rs.getString(2));
                kar.setIdkaryawan(rs.getInt(3));
                kar.setNama(rs.getString(4));
                kar.setTgllahir(rs.getString(5));
                kar.setAlamat(rs.getString(6));
                kar.setNohp(rs.getString(7));
                kar.setJeniskel(rs.getString(8));
                
                get.add(kar);
            }
        } catch (Exception e) {
        }
        return get;
    }
  public String hapus(String id) {
        String hasil = "tidak berhasil hapus";
        String query = "DELETE FROM tb_karyawan WHERE idkaryawan='" + id + "'";
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
     public String Updatekaryawan(String username,String password,int idkaryawan, String nama, String tgllahir, String alamat, String nohp,String jeniskel) {
        String hasil = "tidak berhasil update";
        String sql = "UPDATE tb_karyawan SET nama='" + nama + "',tgllahir='" + tgllahir + "', alamat= '" + alamat + "', Nohp= '" + nohp + "', jeniskel= '" + jeniskel + "', username= '" + username + "', password= '" + password + "' WHERE idkaryawan = " + idkaryawan;
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
 
