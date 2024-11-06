package praktikum.sesi7;

class Mahasiswa {
    public String nama; // Public: bisa diakses dari nama saja
    protected int usia; // Protected: bisa diakses dari dalam package dan subclass

    private String jurusan; // Private: hanya bisa diakses dalam kelas ini

    // Konstruktor
    public Mahasiswa(String nama, int usia, String jurusan){
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    // Getter untuk atribut private jurusan
    public String getJurusan(){
        return jurusan;
    }

    // Setter untuk atribut private jurusan
    public void setJurusan(String jurusanBaru){
        this.jurusan = jurusanBaru;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jurusan: " + jurusan);
    }
}

// Kelas utama untuk menjalankan program
public class MhsTester {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 21,  "Teknik Informatika");

        // Mengakses atribut Public
        System.out.println("Nama Mahasiswa: " + mahasiswa1.nama); // Output: Andi

        // Mengakses atribut Protected (dapat diakses dalam package yang sama)
        System.out.println("Usia Mahasiswa: " + mahasiswa1.usia); // Output: 21

        // Mengakses atribut Private menggunakan getter
        System.out.println("Jurusan Mahasiswa: " + mahasiswa1.getJurusan()); // Output: Teknik Informatika

        // Mengubah nilai atribut private menggunakan setter
        mahasiswa1.setJurusan("Sistem Informasi");
        System.out.println("\nJurusan Mahasiswa Setelah Diubah : " + mahasiswa1.getJurusan()); // Output: Sistem Informasi

        // Menampilkan informasi lengkap mahasiswa
        mahasiswa1.tampilkanInfo();
    }
}
