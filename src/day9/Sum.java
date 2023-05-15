
package day9;

//Assignment 13
    public class Sum {
        public static int calculateSum(int N) {
            if (N == 0) {
                return 0;
            } else {
                return N % 10 + calculateSum(N / 10);
            }
        }

        public static void main(String[] args) {
            int num1 = 123;
            int num2 = 1000;
            int sum1 = calculateSum(num1);
            int sum2 = calculateSum(num2);
            System.out.println("Sum of " + num1 + ": " + sum1);
            System.out.println("Sum of " + num2 + ": " + sum2);

        }
    }

