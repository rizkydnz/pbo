package praktikum.sesi7;

class Mobil{
    public String merk;                 // Public: bisa diakses dari mana saja
    protected int tahunProduksi;        // Protected: bisa diakses dari dalam package dan subclass

    private int harga;               // Private: hanya bisa diakses dalam kelas ini

    // Konstruktor
    public Mobil(String merk, int tahunProduksi, int harga){
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    // Getter untuk atribut private harga
    public int getHarga(){
        return harga;
    }

    // Setter untuk atribut private harga
    public void setHarga(int hargaBaru){
        if(hargaBaru > 0){      // Validasi harga baru harus Positif
            this.harga = hargaBaru;
        } else {
            System.out.println("Harga harus lebih besar dari 0.");
        }
    }

    // Metode untuk menampilkan informasi mobil
    public void tampilkanInfoMobil(){
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);
    }
}

// Kelas utama untuk menjalankan program
public class MobilCek {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil1 = new Mobil("Toyota", 2022, 300000000);

        // Mengakses atribut public
        System.out.println("Merk mobil: " + mobil1.merk); // Output: Toyota

        // Mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi); // Output: 2022

        // Mengakses atribut private menggunakan getter
        System.out.println("Harga Mobil: " + mobil1.getHarga()); // Output: 300000000.0

        // Mengubah nilai atribut private menggunakan setter
        mobil1.setHarga(350000000);
        System.out.println("Harga Mobil setelah Diubah: " + mobil1.getHarga()); // Output: 350000000.0

        // Menampilkan informasi lengkap mobil
        mobil1.tampilkanInfoMobil();
    }
}
