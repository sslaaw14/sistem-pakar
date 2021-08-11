/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PakarSistem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PakarSistem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double threshold = 80;
        
        System.out.println("---SISTEM PAKAR PENYAKIT GASTRO USUS---");
        ArrayList<Klinis> gejalaKlinis = new  ArrayList<Klinis>();
        System.out.println("Jawab Pertanyaan berikut dengan y atau t! ");
        
        //Pengecekan gejala klinis
        Klinis klinis = 
                new Klinis("1. Sering mengalami buang air besar "
                        + "(lebih dari 2 kali)? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("2. Mengalami berak encer ? (y/t)",false);
        gejalaKlinis.add(klinis); 
        klinis = new Klinis("3. Mengalami berak berdarah ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("4. Merasa lesu dan tidak bergairah ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("5. Tidak selera makan ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("6. Merasa mual dan sering muntah "
                + "(lebih dari 1 kali) ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("7. Merasa sakit di bagian perut ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("8. Tekanan darah anda rendah ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("9. Merasa pusing ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("10. Mengalami pingsan ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("11. Suhu badan anda tinggi ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("12. Mengalami luka di "
                + "bagian tertentu ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("13. Tidak dapat menggerakkan "
                + "anggota badan tertentu ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("14. Pernah memakan sesuatu ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("15. Memakan daging ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("16. Memakan jamur ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("17. Memakan makanan kaleng ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("18. Membeli susu ? (y/t)",false);
        gejalaKlinis.add(klinis);
        klinis = new Klinis("19. Meminum susu ? (y/t)",false);
        gejalaKlinis.add(klinis);
        
        for(int i=0; i< gejalaKlinis.size();i++)
        {
            System.out.print(gejalaKlinis.get(i).getPertanyaan());
            Scanner scan = new Scanner(System.in);
            if("y".equals(scan.nextLine())){
                gejalaKlinis.get(i).setJawaban(true);   
            }
            else{
                gejalaKlinis.get(i).setJawaban(false);
            }
          
        }
        
        //identifikasi penyakit1
        ArrayList<KlinisList> klinisList = new ArrayList<KlinisList>();
        KlinisList klinisGejalaList = new KlinisList(1,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(2,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        Fisik mencret = new Fisik(20,klinisList);
         
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(6,0);
        klinisList.add(klinisGejalaList);
        Fisik muntah = new Fisik(21,klinisList);
         
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(7,0);
        klinisList.add(klinisGejalaList);
        Fisik sakitperut = new Fisik(22,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(8,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(9,0);
        klinisList.add(klinisGejalaList);
        Fisik darahrendah = new Fisik(23,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(14,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(15,0);
        klinisList.add(klinisGejalaList);
        Fisik makandaging = new Fisik(29,klinisList);
        
        ArrayList<Fisik> fisik= new ArrayList<Fisik>();
        fisik.add(mencret);
        fisik.add(muntah);
        fisik.add(sakitperut);
        fisik.add(darahrendah);
        fisik.add(makandaging);
        
        PenyakitList penyakit1 =new PenyakitList(33,fisik);
        // akhir dari penyakit 1
        //penyakit2
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(1,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(2,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        mencret = new Fisik(20,klinisList);
         
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(6,0);
        klinisList.add(klinisGejalaList);
        muntah = new Fisik(21,klinisList);
         
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(7,0);
        klinisList.add(klinisGejalaList);
        sakitperut = new Fisik(22,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(8,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(10,0);
        klinisList.add(klinisGejalaList);
        Fisik koma = new Fisik(24,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(14,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(16,0);
        klinisList.add(klinisGejalaList);
        Fisik makanjamur = new Fisik(30,klinisList);
        
        fisik = new ArrayList<Fisik>();
        fisik.add(mencret);
        fisik.add(muntah);
        fisik.add(sakitperut);
        fisik.add(koma);
        fisik.add(makanjamur);
        
        PenyakitList penyakit2 =new PenyakitList(34,fisik);
        //penyakit3
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(1,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(2,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        mencret = new Fisik(20,klinisList);
         
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(6,0);
        klinisList.add(klinisGejalaList);
        muntah = new Fisik(21,klinisList);
         
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(7,0);
        klinisList.add(klinisGejalaList);
        sakitperut = new Fisik(22,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(9,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(11,0);
        klinisList.add(klinisGejalaList);
        Fisik demam = new Fisik(25,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(8,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(11,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(12,0);
        klinisList.add(klinisGejalaList);
        Fisik septicaemia = new Fisik(26,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(14,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(15,0);
        klinisList.add(klinisGejalaList);
        makandaging = new Fisik(29,klinisList);
        
        fisik= new ArrayList<Fisik>();
        fisik.add(mencret);
        fisik.add(muntah);
        fisik.add(sakitperut);
        fisik.add(demam);
        fisik.add(septicaemia);
        fisik.add(makandaging);
        
        PenyakitList penyakit3 =new PenyakitList(35,fisik);
        //penyakit4
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(6,0);
        klinisList.add(klinisGejalaList);
        muntah = new Fisik(21,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(13,0);
        klinisList.add(klinisGejalaList);
        Fisik lumpuh = new Fisik(27,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(14,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(17,0);
        klinisList.add(klinisGejalaList);
        Fisik makanmakankaleng = new Fisik(31,klinisList);
        
        fisik= new ArrayList<Fisik>();
        fisik.add(muntah);
        fisik.add(lumpuh);
        fisik.add(makanmakankaleng);
        
        PenyakitList penyakit4 =new PenyakitList(36,fisik);
        // tMBhkN KE 2 ... 5
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(1,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(2,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
         mencret = new Fisik(20,klinisList);
         
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(7,0);
        klinisList.add(klinisGejalaList);
        sakitperut = new Fisik(22,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(4,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(5,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(9,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(11,0);
        klinisList.add(klinisGejalaList);
        demam = new Fisik(25,klinisList);
        
        klinisList = new ArrayList<KlinisList>();
        klinisGejalaList = new KlinisList(18,0);
        klinisList.add(klinisGejalaList);
        klinisGejalaList = new KlinisList(19,0);
        klinisList.add(klinisGejalaList);
        Fisik minumsusu = new Fisik(32,klinisList);
        
        fisik= new ArrayList<Fisik>();
        fisik.add(mencret);
        fisik.add(sakitperut);
        fisik.add(demam);
        fisik.add(minumsusu);
        
        PenyakitList penyakit5 =new PenyakitList(37,fisik);

        ArrayList<PenyakitList> penyakitList= new ArrayList<PenyakitList>();
        penyakitList.add(penyakit1);
        
        penyakitList.add(penyakit2);
        
        penyakitList.add(penyakit3);
       
        penyakitList.add(penyakit4);
        penyakitList.add(penyakit5);
        // ADD PENYAKIT2...5
        for(int i=0;i<penyakitList.size();i++){
            double count=0;
           for(int j=0;j< penyakitList.get(i).getGejalaFisik().size();j++){
               int counter=0;
               for(int k=0; k<penyakitList.get(i).getGejalaFisik().get(j).getDaftarGejalaKlinis().size();k++){
                   for(int l=0; l<gejalaKlinis.size();l++){
                         if(l+1 == penyakitList.get(i).getGejalaFisik().get(j).getDaftarGejalaKlinis().get(k).getId()){
                            if(gejalaKlinis.get(l).isJawaban()== true){
                                  penyakitList.get(i).getGejalaFisik().get(j).getDaftarGejalaKlinis().get(k).setHasil(l);
                                  counter++;
                            }    
                         }
                    } 
               }
               //menjumlah hasil
               double total =(double)counter/penyakitList.get(i).getGejalaFisik().get(j).getDaftarGejalaKlinis().size();
                penyakitList.get(i).getGejalaFisik().get(j).setHasil(total);
                count+=total;            
           }
           //menghitung persenan
           double totalpenyakit= count / penyakitList.get(i).getGejalaFisik()
                   .size()*100;
              
           penyakitList.get(i).setHasil(totalpenyakit);
        }
        //Menampilkan hasil dari semua penyakit
         for(int i=0;i<penyakitList.size();i++){
             System.out.println(" ");
             switch(i){
                case 0:
                    System.out.print("Keracunan Staphylococcus aureus : ");
                    System.out.println(penyakitList.get(i).getHasil());
                    break;
                case 1:
                    System.out.print("Keracunan jamur Beracun : ");
                    System.out.println(penyakitList.get(i).getHasil()); 
                    break;
                case 2:
                    System.out.print("Keracunan Salmonellae : ");
                    System.out.println(penyakitList.get(i).getHasil());
                    break;
                case 3:
                    System.out.print("Keracunan Clostridium botulinum : ");
                    System.out.println(penyakitList.get(i).getHasil());
                    break;
                case 4:
                    System.out.print("Keracunan Campylobacter : ");
                    System.out.println(penyakitList.get(i).getHasil());
                    break;
                    
             }
             
             System.out.println(" ");
         }
         //Penghitungan diagnosa
         double maks=0;
         int indexmaks=0;
         String diagnosa[]={"Keracunan Staphylococcus aureus",
             "Keracunan jamur Beracun",
             "Keracunan Salmonellae",
             "Keracunan Clostridium botulinum",
             "Keracunan Campylobacter"};
         
         for(int j=0;j<penyakitList.size();j++){
             if(penyakitList.get(j).getHasil()>=threshold){
                 if(maks < penyakitList.get(j).getHasil()){
                     maks = penyakitList.get(j).getHasil();
                     indexmaks=j;
                 }
             }
        }
         if(maks > threshold){
             System.out.println("\nAnda terinfeksi "+diagnosa[indexmaks]);
         }
         else
             System.out.println("Anda Sehat dan tidak terinfeksi");
    
  }
}
