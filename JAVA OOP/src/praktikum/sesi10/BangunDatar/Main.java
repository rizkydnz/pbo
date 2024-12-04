package praktikum.sesi10.BangunDatar;

public class Main {
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bangundatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        // membuat objek lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        // membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 8;
        persegipanjang.lebar = 4;

        //membuat objek segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;

        // memanggil method luas dan keliling
        bangundatar.luas();
        bangundatar.keliling();

        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();

    }
}
