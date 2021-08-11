/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PakarSistem;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PenyakitList {
    private int id;
    private ArrayList<Fisik> gejalaFisik = new ArrayList<Fisik>();
    private double hasil;

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public PenyakitList(){
        
    }
    
    public PenyakitList(int id,ArrayList<Fisik> gejalaFisik){
        this.id=id;
        this.gejalaFisik=gejalaFisik;  
    }
    
    public PenyakitList(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Fisik> getGejalaFisik() {
        return gejalaFisik;
    }

    public void setGejalaFisik(ArrayList<Fisik> gejalaFisik) {
        this.gejalaFisik = gejalaFisik;
    }
    
}
