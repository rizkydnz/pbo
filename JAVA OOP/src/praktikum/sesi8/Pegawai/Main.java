package praktikum.sesi8.Pegawai;

public class Main {
    public static void main(String[] args) {
        pegawai Pegawai = new pegawai();
        manager Manager = new manager();
        kasir Kasir = new kasir();
        koki Koki = new koki();
        pelayan Pelayan = new pelayan();
        satpam Satpam = new satpam();

        Manager.nama = "Sifa";
        Manager.id_pegawai = 1;
        Manager.gaji ="7 juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = 2;
        Kasir.gaji = "1,2 juta";

        Koki.nama = "Reza";
        Koki.id_pegawai = 3;
        Koki.gaji = "2 juta";

        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = 4;
        Pelayan.gaji = "1,5 juta";

        Satpam.nama = "Mika";
        Satpam.id_pegawai = 5;
        Satpam.gaji = "2 juta";

        Pegawai.menampilkan();

        Manager.menampilkan();
        Manager.tugas();

        Kasir.menampilkan();
        Kasir.tugas();

        Koki.menampilkan();
        Koki.tugas();

        Pelayan.menampilkan();
        Pelayan.tugas();

        Satpam.menampilkan();
        Satpam.tugas();
    }
}
