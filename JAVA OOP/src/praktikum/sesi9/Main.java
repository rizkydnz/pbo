package praktikum.sesi9;

// Abstract Class
abstract class Bentuk {
    // Metode abstrak untuk menghitung luas dan keliling
    public abstract double getLuas();

    public abstract double getKeliling();
}

// Interface
interface Berwarna {
    String getWarna();
}

// Kelas Lingkaran yang mewarisi Bentuk dan mengimplementasikan Berwarna
class Lingkaran extends Bentuk implements Berwarna {
    private double jariJari;
    private String warna;

    // Constructor
    public Lingkaran(double jariJari, String warna) {
        this.jariJari = jariJari;
        this.warna = warna;
    }

    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public String getWarna() {
        return warna;
    }
}

// Kelas PersegiPanjang yang mewarisi Bentuk dan mengimplementasikan Berwarna
class PersegiPanjang extends Bentuk implements Berwarna {
    private double panjang;
    private double lebar;
    private String warna;

    // Constructor
    public PersegiPanjang(double panjang, double lebar, String warna) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.warna = warna;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public String getWarna() {
        return warna;
    }
}

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dan PersegiPanjang
        Bentuk lingkaran = new Lingkaran(7, "Merah");
        Bentuk persegiPanjang = new PersegiPanjang(5, 10, "Biru");

        // Menampilkan detail Lingkaran
        System.out.println("Detail Lingkaran:");
        System.out.println("Warna: " + ((Berwarna) lingkaran).getWarna());
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());

        // Menampilkan detail Persegi Panjang
        System.out.println("\nDetail Persegi Panjang:");
        System.out.println("Warna: " + ((Berwarna) persegiPanjang).getWarna());
        System.out.println("Luas: " + persegiPanjang.getLuas());
        System.out.println("Keliling: " + persegiPanjang.getKeliling());
    }
}

