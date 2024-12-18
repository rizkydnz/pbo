package praktikum.sesi12.quiz;

interface Transportasi {
    public void tampil();  // Display method
    public void setData(int id);  // Set data method
    public int getId();  // Get ID method
}

class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    @Override
    public void tampil() {
        System.out.println("Harga: " + harga);
        System.out.println("ID: " + id);
    }

    @Override
    public void setData(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
}

class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    public Bayar(String nama, int jarak, int harga) {
        this.nama = nama;
        this.jarak = jarak;
        this.harga = harga;
        this.total = jarak * harga;  // Calculate total cost based on distance
    }

    public void bayar() {
        System.out.println("Pembayaran oleh: " + nama);
        System.out.println("Harga per KM: " + harga);
        System.out.println("Total biaya: " + total);
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak);
        System.out.println("Total: " + total);
    }

    @Override
    public void setData(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}

public class quiz2 {
    public static void main(String[] args) {
        Bayar bayar1 = new Bayar("Rizky", 7, 35000);
        bayar1.setData(101);
        
        System.out.println("\nDetail Gojek:");
        bayar1.tampil();
        
        System.out.println("\nProses Pembayaran:");
        bayar1.bayar();

    }
}
