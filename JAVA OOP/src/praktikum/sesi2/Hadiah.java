package praktikum.sesi2;

import java.util.Scanner;

public class Hadiah {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner (System.in);

        // mengambil input
        System.out.print("Total Belanja : Rp ");
        belanja = scan.nextInt();

        // cek apakah dia belanja diatas 100.000
        if(belanja > 100000){
            System.out.println("Selamat, Anda mendapatkan hadiah!");
        }else if(belanja < 100000){
            System.out.println("Maaf, Anda tidak mendapatkan hadiah");
        }
        System.out.println("Terima Kasih...");

        scan.close();
    }
}
