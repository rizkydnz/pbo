package praktikum.sesi9.Tugas;

// Abstract class BangunDatar
abstract class BangunDatar {
    protected double a, b, c;

    protected abstract void set_A(double a);

    protected abstract void set_B(double b);

    protected abstract void set_C();

    protected abstract double get_A();

    protected abstract double get_B();

    protected abstract double get_C();

    protected abstract void tampil();
}

// Kelas Segitiga
class Segitiga extends BangunDatar {

    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C() {
        this.c = 0.5 * a * b; // Hitung luas segitiga
    }

    @Override
    protected double get_A() {
        return this.a;
    }

    @Override
    protected double get_B() {
        return this.b;
    }

    @Override
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Segitiga:");
        System.out.println("Panjang Alas: " + get_A());
        System.out.println("Tinggi: " + get_B());
        System.out.println("Luas: " + get_C());
        System.out.println();
    }
}

// Kelas Persegi Panjang
class PersegiPanjang extends BangunDatar {

    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C() {
        this.c = 2 * (a + b); // Hitung keliling persegi panjang
    }

    @Override
    protected double get_A() {
        return this.a;
    }

    @Override
    protected double get_B() {
        return this.b;
    }

    @Override
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Persegi Panjang:");
        System.out.println("Panjang: " + get_A());
        System.out.println("Lebar: " + get_B());
        System.out.println("Luas: " + (get_A() * get_B()));
        System.out.println("Keliling: " + get_C());
        System.out.println();
    }
}

// Kelas Lingkaran
class Lingkaran extends BangunDatar {

    @Override
    protected void set_A(double a) {
        this.a = a; // a digunakan sebagai jari-jari
    }

    @Override
    protected void set_B(double b) {
        this.b = 0; // Tidak digunakan
    }

    @Override
    protected void set_C() {
        this.c = 2 * Math.PI * a; // Hitung keliling lingkaran
    }

    @Override
    protected double get_A() {
        return this.a;
    }

    @Override
    protected double get_B() {
        return 0;
    }

    @Override
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Lingkaran:");
        System.out.println("Jari-jari: " + get_A());
        System.out.println("Luas: " + (Math.PI * get_A() * get_A()));
        System.out.println("Keliling: " + get_C());
        System.out.println();
    }
}

// Main Class
public class BangunDatarMain {
    public static void main(String[] args) {
        double a = 5.0; // Parameter A
        double b = 3.0; // Parameter B

        // Array Polimorfisme untuk menampung berbagai bentuk BangunDatar
        BangunDatar[] bangunDatar = new BangunDatar[3];
        bangunDatar[0] = new Segitiga();
        bangunDatar[1] = new PersegiPanjang();
        bangunDatar[2] = new Lingkaran();

        // Set parameter dan tampilkan hasil
        for (BangunDatar bd : bangunDatar) {
            bd.set_A(a);
            bd.set_B(b);
            bd.set_C();
            bd.tampil();
        }
    }
}

