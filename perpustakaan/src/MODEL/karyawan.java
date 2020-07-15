/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author x.x
 */
public class karyawan {
      //getter dan seter semua var 
      private int idkaryawan;
      private String username;
      private String password;
    private String nama;
    private String tgllahir;
    private String alamat;
    private String jeniskel;
    private String nohp;

    public int getIdkaryawan() {
        return idkaryawan;
    }

    public void setIdkaryawan(int idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskel() {
        return jeniskel;
    }

    public void setJeniskel(String jeniskel) {
        this.jeniskel = jeniskel;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
