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
public class Fisik {
    private int id;
    private ArrayList<KlinisList> daftarGejalaKlinis = new  ArrayList<KlinisList>();
    private double hasil;

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public Fisik(){
        
    }

    public Fisik(int id,ArrayList<KlinisList> daftarGejalaKlinis ) {
        this.id = id;
        this.daftarGejalaKlinis = daftarGejalaKlinis;
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<KlinisList> getDaftarGejalaKlinis() {
        return daftarGejalaKlinis;
    }
    

    public void setDaftarGejalaKlinis(ArrayList<KlinisList> daftarGejalaKlinis) {
        this.daftarGejalaKlinis = daftarGejalaKlinis;
    }
   
    
}
