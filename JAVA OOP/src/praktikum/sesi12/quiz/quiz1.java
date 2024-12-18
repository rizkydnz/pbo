package praktikum.sesi12.quiz;

class Dosen {
    protected String nik;
    protected String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}

class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        super.view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        super.view();
        System.out.println("Fakultas: " + fakultas);
    }
}

public class quiz1 {
    public static void main(String[] args) {
        Rektor rektor = new Rektor("20161772", "Dr. Budi S.T, M.T", 2019);
        Dekan dkn1 = new Dekan("20171721", "Dr. Ade", "Kedokteran");

        System.out.println("Data Rektor:");
        rektor.viewRektor();

        System.out.println("\nData Dekan:");
        dkn1.viewDekan();

    }
}
