/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kurnia Indah N
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int pilih;

        System.out.println("Menghitung Volume dan Luas Pwemukaan Bangun Ruang");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Limas Segitiga");
        System.out.println("Pilihan = ");
        pilih = menu.nextInt();                
        Scanner panggil = new Scanner(System.in);
        double hasil,hasil1;
        boolean inputan=true;        
        switch (pilih)
        {
            case 1 :
                do{
                    try {
                        System.out.println("Pilihan Anda Menghitung Balok");
                        double pjng, lbr, tng;
                        System.out.println("Panjang = ");
                        pjng=panggil.nextDouble();
                        System.out.println("Lebar = ");
                        lbr=panggil.nextDouble();
                        System.out.println("Tinggi = ");
                        tng=panggil.nextDouble();
                        Balok balok = new Balok();
                        hasil=balok.Volume(pjng,lbr,tng);
                        System.out.println("Volume = "+hasil);
                        hasil1=balok.Luas(pjng, lbr, tng);
                        System.out.println("Luas Permukaan = "+hasil1);
                    inputan=false;
                    }

                    catch(InputMismatchException ex){
                        System.out.println(" ");
                        System.out.println(ex);
                        System.out.println("Error!");
                        System.out.println(" ");
                        panggil.nextLine();
                     }
                } while(inputan);
                break;   
                
            case 2 :
                do {
                    try {
                        System.out.println("Pilihan Anda Menghitung Kerucut");
                        double jari, ting, tsel;
                        System.out.println("Jari-Jari = ");
                        jari=panggil.nextDouble();
                        System.out.println("Tinggi Kerucut = ");
                        ting=panggil.nextDouble();
                        System.out.println("Tinggi Selimut = ");
                        tsel=panggil.nextDouble();
                        Kerucut kerucut = new Kerucut();
                        hasil=kerucut.Volume(jari, ting);
                        System.out.println("Volume = "+hasil);
                        hasil1=kerucut.Luas(jari, tsel);
                        System.out.println("Luas Permukaan = "+hasil1);
                    inputan=false;
                    }

                    catch(InputMismatchException ex){
                        System.out.println(" ");
                        System.out.println(ex);
                        System.out.println("Error!");
                        System.out.println(" ");
                        panggil.nextLine();
                     }
                } while(inputan);
                break;
                
            case 3 :
                do {
                    try {
                        System.out.println("Pilihan Anda Menghitung Limas Segitiga");
                        double al, tinga, tingg, sisteg;
                        System.out.println("Panjang Alas = ");
                        al=panggil.nextDouble();
                        System.out.println("Tinggi Alas = ");
                        tinga=panggil.nextDouble();
                        System.out.println("Tinggi = ");
                        tingg=panggil.nextDouble();
                        System.out.println("Sisi Tegak = ");
                        sisteg=panggil.nextDouble();
                        Limassegitiga limasseg = new Limassegitiga();
                        hasil=limasseg.Volume(al,tinga,tingg);
                        System.out.println("Volume = "+hasil);
                        hasil1=limasseg.Luas(al,tinga,sisteg);
                        System.out.println("Luas Permukaan = "+hasil1);
                    inputan=false;
                    }

                    catch(InputMismatchException ex){
                        System.out.println(" ");
                        System.out.println(ex);
                        System.out.println("Error!");
                        System.out.println(" ");
                        panggil.nextLine();
                     }
                } while(inputan);
                break;
                
            case 4 :
                exit(0);
            }

        // TODO code application logic here
        }
    }
