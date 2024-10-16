package praktikum.quiz;

import java.util.Scanner;

public class ForOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan batas bawah: ");
        int batasBawah = input.nextInt();

        System.out.print("Masukan batas atas: ");
        int batasAtas = input.nextInt();

        System.out.println("\nBilangan genap: ");
        for(int i  = batasBawah; i <= batasAtas; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBilangan ganjil: ");
        for(int i  = batasBawah; i <= batasAtas; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        input.close();

    }
}
