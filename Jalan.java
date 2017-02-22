/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Regyma
 */

import java.util.Scanner;

public class Jalan {
    private static int pilih; 
    private static int a; 
    public static void main(String [] args) { 
        Mobil jalan1 = new Mobil(180, 0, 0); 
        Scanner in = new Scanner(System.in); 
        while (!jalan1.isStarted()) { 
            System.out.println("1. Start Mobil"); 
            System.out.println("2. Ganti Gigi"); 
            System.out.println("3. Gas Mobil"); 
            System.out.println("4. Rem Mobil"); 
            System.out.println("5. Stop Mobil"); 
            System.out.println(""); 
             
            System.out.print("Pilih Menu : ");
            
            pilih = in.nextInt(); 
            switch (pilih) { 
                case 1 : 
                    jalan1.start();
                    System.out.println("Mobil di starter");
                    System.out.println("");
                    break; 
                case 2 :
                    System.out.print("Pilih Gigi (1-5) : "); 
                    int Gigi = in.nextInt(); 
                    jalan1.gantiGigi(Gigi);
                    break; 
                case 3 : 
                    jalan1.gas();
                    System.out.println("Kecepatan Mobil "+ jalan1.getKecActual()+"km/jam");
                    System.out.println("");
                    break; 
                case 4 : 
                    jalan1.rem();
                    System.out.println("Kecepatan Mobil "+ jalan1.getKecActual()+"km/jam");
                    System.out.println("");
                    break; 
                case 5 : 
                    jalan1.stop(); 
                    break; 
            }    
        } 
    }
    
}
