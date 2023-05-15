//Java annotation is a construct that provides additional information about a program's classes, methods, and variables to a compiler but does not become part of it.

package day5;

/**
 * This is the calculation application which shows multiplication of different data types.
 */
public class CalculationApp {
    /**
     * The multiply method is the main method used in here.
     */
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
    /**
     *This method multiplies two integers.
     * @param a is the first integer
     * @param b is the second integer.
     */
    public void multiply(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    /**
     *This method multiplies two float numbers.
     * @param a is the first number
     * @param b is the second number.
     */
    public void multiply(float a, float b) {
        float c = a * b;
        System.out.println(c);
    }

    /**
     *This method multiplies two double numbers.
     * @param a is the first number
     * @param b is the second number.
     */
    public void multiply(double a, double b) {
        double c = a * b;
        System.out.println(c);
    }
}
