package praktikum.sesi1;

import java.util.Scanner;

public class TugasKalkulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner untuk membaca inputan dari pengguna

        System.out.println("\n================================================");
        System.out.println("Tugas Praktikum PBO Membuat Kalkulator Sederhana");
        System.out.println("================================================");
        System.out.println("Nama : Rizky Dwi Nugroho");
        System.out.println("NIM : 20230801412");
        System.out.println("================================================\n");
        System.out.print("Welcome, tekan enter untuk melanjutkan program "); // tekan enter untuk melanjutkan
        input.nextLine(); // untuk melakukan pause

        System.out.print("\033[H\033[2J");
        System.out.flush(); // Untuk membersihkan tampilan saat output
        
        // Menampilkan dan memasukkan angka
        System.out.println("==================================================");
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("==================================================");
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        System.out.println("==================================================\n");
        
        // Menampilkan pilihan operasi
        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = input.nextInt();
        
        int hasil = 0;
        boolean operasiValid = true;
        
        // Melakukan operasi sesuai pilihan pengguna
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("\nHasil: " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("\nHasil: " + angka1 + " - " + angka2 + " = " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("\nHasil: " + angka1 + " * " + angka2 + " = " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("\nHasil: " + angka1 + " / " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    operasiValid = false;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                operasiValid = false;
        }
        
        // Jika operasi valid, tampilkan hasilnya
        if (operasiValid) {
            System.out.println("Operasi selesai.\n");
        } else {
            System.out.println("Operasi tidak dapat dilanjutkan.\n");
        }

        input.close();
    }
}
