/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KONEKSI;
import com.mysql.jdbc.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
//import library
/**
 *
 * @author x.x
 */
public class koneksi {//program untuk mencek koneksi ke database
   private static Connection koneksi;
   public static Connection getKoneksi() {
           if (koneksi==null) {
               try {
                   String url;//membuat var
                   url = "jdbc:mysql://localhost:3306/dbperpus";//var url=url database
                   String username="root";//set var username
                   String password="";//set var pass
                   DriverManager.registerDriver(new com.mysql.jdbc.Driver());//meregis driver
                   koneksi =  (Connection) DriverManager.getConnection(url,username,password);
               }catch(SQLException t){
                   JOptionPane.showMessageDialog(null,"koneksi eror");//menampilkan "koneksi eror" jika ada eror 
               }
           }return koneksi;//mengembalikan
   }
}
