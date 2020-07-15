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
public class member {
      //getter dan seter semua var 
    private int idpeminjam;
    private String nama;
    private String tgllahir;
    private String alamat;
    private String noHp;

    public int getIdpeminjam() {
        return idpeminjam;
    }

    public void setIdpeminjam(int idpeminjam) {
        this.idpeminjam = idpeminjam;
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

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}
