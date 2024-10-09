package praktikum.sesi2;

import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        // membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Inputkan Nama Warna : ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu Merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, Harap Hati-Hati");
                break;
            case "hijau":
                System.out.println("Lampu Hijau, Silahkan Jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah");
        }

        scan.close();
    }
}
