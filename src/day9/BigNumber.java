package day9;

import java.math.BigInteger;

public class BigNumber {

    public static void main(String[] args) {

        long l = 456144245;
        BigInteger bigInteger = new BigInteger("2");
        BigInteger sum = bigInteger.divide(BigInteger.valueOf(10));
        System.out.println(sum);

        System.out.println(bigInteger.signum());
        if (bigInteger.signum() == -1) {
            System.out.println("Negative");

        } else if (bigInteger.signum() == 1) {
            System.out.println("positive");

        } else {
            System.out.println("Zero");

        }


        // Q.15. You are provided with a number N integer, calculate the N^11.
        //Steps :
        //Convert N to Big Integer (Required)
        //Calculate power of that big integer
        //Print the result

        int N = 456;

        BigInteger bigNumber = BigInteger.valueOf(N);

        // N^11
        BigInteger output = bigNumber.pow(11);

        System.out.println(output);

    }
}
