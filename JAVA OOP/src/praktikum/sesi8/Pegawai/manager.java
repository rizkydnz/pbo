package praktikum.sesi8.Pegawai;

public class manager extends pegawai{
    //tambahkan @Override diatas fungsi void menampilkan().
    //override sendiri berfungsi sebagai pembuatan ulang method dari superclass untuk subclass.
    @Override
    public void menampilkan(){
        //untuk nilai dari void menampilkan bisa berbeda dari nilai yang ada pada superclass.
        System.out.println("Nama: " + nama);
        System.out.println("Id Pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    public void tugas(){
        //untuk fungsi dari void tugas() merupakan fungsi spesifik yang hanya dinilai oleh class manager.
        System.out.println("Tugas: Melakukan manajemen untuk franchise.");
        System.out.println("---------------------------------------------");
    }
}
