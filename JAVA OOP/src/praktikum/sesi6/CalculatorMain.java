package praktikum.sesi6;

class Calculator {
    // Attribute (operan1 dan operan2)
    public double operan1;
    public double operan2;

    // Method to set operan1
    public void isiOperan1(double x) {
        this.operan1 = x;
    }

    // Method to set operan2
    public void isiOperan2(double x) {
        this.operan2 = x;
    }

    // Method to add operan1 and operan2
    public double tambah() {
        return operan1 + operan2;
    }

    // Method to subtract operan1 from operan2
    public double kurang() {
        return operan1 - operan2;
    }

     // Method to multiply operan1 and operan2
     public double kali() {
        return operan1 * operan2;
    }

    // Method to divide operan1 by operan2
    public double bagi() {
        if (operan2 != 0) {
            return operan1 / operan2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Return NaN (Not a Number) for division by zero
        }
    }

    // Method to calculate operan1 raised to the power of operan2
    public double pangkat() {
        return Math.pow(operan1, operan2);
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Setting values
        calc.isiOperan1(10.0);
        calc.isiOperan2(4.0);
        
        // Displaying results
        System.out.println("Operan1 + Operan2 = " + calc.tambah());
        System.out.println("Operan1 - Operan2 = " + calc.kurang());
        System.out.println("Operan1 * Operan2 = " + calc.kali());
        System.out.println("Operan1 / Operan2 = " + calc.bagi());
        System.out.println("Operan1 ^ Operan2 = " + calc.pangkat());

    }
}
