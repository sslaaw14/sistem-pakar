/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PakarSistem;

/**
 *
 * @author ASUS
 */
public class KlinisList {
    private int id;
    private int hasil;

    public KlinisList(){
        
    }
    public KlinisList(int id, int hasil) {
        this.id = id;
        this.hasil = hasil;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
    
    
}
