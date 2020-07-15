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
public class datapeminjaman {
      //getter dan seter semua var 
    private int idpinjam;
    private String tgl1;
    private String tgl2;
    private int idpeminjam;
    private String denda;
    private int idbuku;

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }
  
    public int getIdpinjam() {
        return idpinjam;
    }

    public void setIdpinjam(int idpinjam) {
        this.idpinjam = idpinjam;
    }

    public String getTgl1() {
        return tgl1;
    }

    public void setTgl1(String tgl1) {
        this.tgl1 = tgl1;
    }

    public String getTgl2() {
        return tgl2;
    }

    public void setTgl2(String tgl2) {
        this.tgl2 = tgl2;
    }

    public int getIdpeminjam() {
        return idpeminjam;
    }

    public void setIdpeminjam(int idpeminjam) {
        this.idpeminjam = idpeminjam;
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }
    
}
