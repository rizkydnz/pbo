package praktikum.sesi2;

public class BilanganPrima {
    public static void main(String[] args) {
        int batasBawah = 2, batasAtas = 30;

        System.out.println("Bilangan Prima antara " + batasBawah + " dan " + batasAtas + " adalah : ");

        // Looping untuk setiao angka dalam rentang
        for(int i = batasBawah; i <= batasAtas; i++){
            boolean prima = true;
        

            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    prima = false;
                    break;
            }
        }
        
        if (prima){
            System.out.print(i + " ");
            }
        }
    }
}