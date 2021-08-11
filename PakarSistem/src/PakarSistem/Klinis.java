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
public class Klinis {
    private String pertanyaan;
    private boolean jawaban;
    
    public Klinis(){
    
    }

    public Klinis(String pertanyaan, boolean jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
    }
    

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public boolean isJawaban() {
        return jawaban;
    }

    public void setJawaban(boolean jawaban) {
        this.jawaban = jawaban;
    }
    
    
}
