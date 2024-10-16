package praktikum.quiz;

import java.util.Scanner;

public class NegatifPositif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka (Positif/Negatif): ");
        int angka = input.nextInt();

        if(angka > 0){
            System.out.println(angka + " adalah angka Positif");
        } else if(angka < 0){
            System.out.println(angka + " adalah angka Negatif");
        } else {
            System.out.println("angka tersebut adalah nol");
        }
        input.close();
        
    }
}
