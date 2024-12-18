package praktikum.sesi12.quiz;

// Interface untuk kemampuan tambahan
interface BisaTerbang {
    boolean getBisaTerbang();
    void setBisaTerbang(boolean bisaTerbang);
}

// Abstract class Animal
abstract class Animal {
    private String nama, sifat;
    private int ukuran;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public String getSifat() {
        return sifat;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }
}

// Kelas Mamalia yang merupakan subclass dari Animal
class Mamalia extends Animal {
    private String jalan, jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    public Mamalia() {}

    public Mamalia(String nama) {
        setNama(nama);
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }
}

// Kelas Aves yang merupakan subclass dari Animal dan mengimplementasikan BisaTerbang
class Aves extends Animal implements BisaTerbang {
    private String jenisAves, terbang;
    private boolean bisaTerbang;

    public Aves() {}

    public Aves(String nama, double ukuran) {
        setNama(nama);
        setUkuran((int) ukuran);
    }

    @Override
    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    @Override
    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }
}

// Subclass Ayam yang merupakan turunan dari Aves
class Ayam extends Aves {
    private String jenisAyam, adu;
    private boolean bisaDiadu;

    public Ayam() {}

    public Ayam(String nama, double ukuran) {
        super(nama, ukuran);
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }
}

// Subclass Merpati yang merupakan turunan dari Aves
class Merpati extends Aves {
    public Merpati(String nama, double ukuran) {
        super(nama, ukuran);
    }
}

public class quiz4 {
    public static void main(String[] args) {
    // Contoh penggunaan Mamalia
        Mamalia mamalia = new Mamalia("Macan Tutul");
        mamalia.setBisaJalan(true);
        mamalia.setJumlahKaki(4);
        mamalia.setJenisMamalia("Karnivora");

        System.out.println("<<< Data Mamalia >>>");
        System.out.println("Nama: " + mamalia.getNama());
        System.out.println("Bisa Jalan: " + mamalia.getBisaJalan());
        System.out.println("Jumlah Kaki: " + mamalia.getJumlahKaki());
        System.out.println("Jenis Mamalia: " + mamalia.getJenisMamalia());

        // Contoh penggunaan Ayam
        Ayam ayam = new Ayam("Ayam Bangkok", 15.0);
        ayam.setJenisAyam("Petarung");
        ayam.setBisaDiadu(true);
        ayam.setBisaTerbang(false);

        System.out.println("\n<<< Data Ayam >>>");
        System.out.println("Nama: " + ayam.getNama());
        System.out.println("Ukuran: " + ayam.getUkuran());
        System.out.println("Jenis Ayam: " + ayam.getJenisAyam());
        System.out.println("Bisa Diadu: " + ayam.getBisaDiadu());
        System.out.println("Bisa Terbang: " + ayam.getBisaTerbang());

        // Contoh penggunaan Merpati
        Merpati merpati = new Merpati("Merpati Pos", 10.0);
        merpati.setBisaTerbang(true);

        System.out.println("\n<<< Data Merpati >>>");
        System.out.println("Nama: " + merpati.getNama());
        System.out.println("Ukuran: " + merpati.getUkuran());
        System.out.println("Bisa Terbang: " + merpati.getBisaTerbang());
    }
}
