package praktikum.sesi6.Tugas;

// Kelas Motor
class Motor {
    // Atribut motor
    String merek;
    String model;
    int kecepatanMaksimum;
    int tahun;

    // Konstruktor Motor
    public Motor(String merek, String model, int kecepatanMaksimum, int tahun) {
        this.merek = merek;
        this.model = model;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.tahun = tahun;
    }

    // Metode untuk menampilkan informasi motor
    public void tampilkanInfo() {
        System.out.println("Merek Motor: " + merek);
        System.out.println("Model Motor: " + model);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaksimum + " km/jam");
        System.out.println("Tahun Produksi: " + tahun);
    }
}

public class TugasClass {
    public static void main(String[] args) {
        // Membuat objek motor
        Motor motor = new Motor("Yamaha", "NMAX", 120, 2021);

        // Menampilkan informasi motor
        motor.tampilkanInfo();
    }
}
