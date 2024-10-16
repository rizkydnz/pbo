package praktikum.quiz;

public class Genap {
    public static void main(String[] args) {
        int angka = 0;
        
        for (int i = 1; i <= 100; i++) { 
            if (i % 2 == 0) {
                angka += i;
            }
        }
        
        System.out.println("Jumlah bilangan genap dari 1 sampai 100: " + angka);

    }
}
