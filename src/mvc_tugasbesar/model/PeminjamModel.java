/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_tugasbesar.model;

import javax.swing.JOptionPane;
import mvc_tugasbesar.event.PeminjamListener;
import mvc_tugasbesar.view.PeminjamView;

/**
 *
 * @author FR13NDS
 */
public class PeminjamModel {
    private String nik;
    private String nama;
    private String notelp;
    private String alamat;
    
    private PeminjamListener peminjamListener;

    public PeminjamListener getPeminjamListener() {
        return peminjamListener;
    }

    public void setPeminjamListener(PeminjamListener peminjamListener) {
        this.peminjamListener = peminjamListener;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if(peminjamListener != null){
            peminjamListener.onChange(this);
        }
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Data berhasil disimpan");
        resetForm();
    }
    
    public void resetForm(){
        setNik("");
        setNama("");
        setNotelp("");
        setAlamat("");
    }
}