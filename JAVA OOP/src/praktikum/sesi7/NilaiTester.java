package praktikum.sesi7;

class Nilai {
    private double Quis;
    private double UTS;
    private double UAS;

    // Setter methods
    public void setQuis(double x) {
        Quis = x;
    }

    public void setUTS(double x) {
        UTS = x;
    }

    public void setUAS(double x) {
        UAS = x;
    }

    // Getter methods
    public double getQuis() {
        return Quis;
    }

    public double getUTS() {
        return UTS;
    }

    public double getUAS() {
        return UAS;
    }

    // Method to calculate final grade
    public double getNA() {
        return 0.20 * Quis + 0.30 * UTS + 0.50 * UAS;
    }
}
public class NilaiTester {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        // Set values using setter methods
        nilai.setQuis(90.0);
        nilai.setUTS(70.0);
        nilai.setUAS(150.0);

        // Get values using getter methods and print final grade
        System.out.println("Nilai Quis: " + nilai.getQuis());
        System.out.println("Nilai UTS: " + nilai.getUTS());
        System.out.println("Nilai UAS: " + nilai.getUAS());

        System.out.println("\nNilai Akhir: " + nilai.getNA());
    }
}
