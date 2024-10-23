package praktikum.sesi6;

class BintangFilm{
    //atributnya
    private String nama;
    private Boolean pria;

    //konstruktor : fungsi yang dijalankan ketika objek diciptakan
    BintangFilm(String nama, Boolean pria){
        this.nama = nama;
        this.pria = pria;
    }

    //Method tanpa return dengan parameter
    public void Isikan(String nama, Boolean pria){
        this.nama = nama;
        this.pria = pria;
    }

    //method dengan return tanpa parameter
    String perolehNama(){
        return(nama);
    }

    String perolehJenisKelamin(){
        if(pria)
            return("Pria");
        else
            return("wanita");
    }
}

public class ClassBintangFilm {
    public static void main(String[] args) {
        BintangFilm siA = new BintangFilm ("Budi", true);
        BintangFilm siB = new BintangFilm ("Hani", false);

        System.out.println("siA => " + siA.perolehNama() + ", " + siA.
        perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.
        perolehJenisKelamin());
    }
}
