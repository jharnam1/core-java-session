package day5;

public class CalculationApp {
    public static void main(String[] args) {
        CalculationApp calculationApp = new CalculationApp();

        int a = 5;
        int b = 2;
        calculationApp.multiply(a, b);

        float c = 5;
        float d = 2;
        calculationApp.multiply(c, d);

        double e = 5;
        double f = 2;
        calculationApp.multiply(e, f);

    }

    // Function overloading

    public void multiply(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    public void multiply(float a, float b) {
        float c = a * b;
        System.out.println(c);
    }

    public void multiply(double a, double b) {
        double c = a * b;
        System.out.println(c);
    }
}
