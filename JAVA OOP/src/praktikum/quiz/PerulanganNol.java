package praktikum.quiz;

import java.util.Scanner;

public class PerulanganNol {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        int angka;
        
        do {
            System.out.print("Masukkan angka (nol untuk berhenti): ");
            angka = input.nextInt();
        } while (angka != 0);
        System.out.println("\nProgram Sudah berhenti.");
        
        input.close();

    }
}
