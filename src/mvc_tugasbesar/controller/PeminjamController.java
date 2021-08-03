/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_tugasbesar.controller;

import javax.swing.JOptionPane;
import mvc_tugasbesar.model.PeminjamModel;
import mvc_tugasbesar.view.PeminjamView;

/**
 *
 * @author FR13NDS
 */
public class PeminjamController {
    private PeminjamModel model;

    public void setModel(PeminjamModel model) {
        this.model = model;
    }
    
    public void SimpanForm(PeminjamView view){
        String nama = view.getTxtNama().getText();
        String nik = view.getTxtNIK().getText();
        String notelp = view.getTxtNoTelp().getText();
        String alamat = view.getTxtAlamat().getText();
        
        if(nik.trim().equals("") || nama.trim().equals("") || notelp.trim().equals("") || alamat.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Pastikan Seluruh Data Terisi!");
        }else{
            model.simpanForm();
        }
    }
    
    public void ResetForm(PeminjamView view){
        model.resetForm();
    }
}
