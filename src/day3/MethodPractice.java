package day3;

public class MethodPractice {

    public static void main(String[] args) {
        MethodPractice methodPractice = new MethodPractice();

        int a = 2;
        int b = 8;

//        int sum1 = a + b;
//        System.out.println(sum1);
//        methodPractice.addAndPrint(a, b);
        int sum1 = methodPractice.addAndReturn(a, b);
        System.out.println(sum1);

        int c = 2;
        int d = 3;

//        int sum2 = c + d;
//        System.out.println(sum2);
//        methodPractice.addAndPrint(c, d);
        int sum2 = methodPractice.addAndReturn(c, d);
        System.out.println(sum2);

        int e = 2;
        int f = 5;

//        int sum3 = e + f;
//        System.out.println(sum3);
//        methodPractice.addAndPrint(e, f);
        int sum3 = methodPractice.addAndReturn(e,f);
        System.out.println(sum3);
    }

    // A function that doesnot return anything - void
    void addAndPrint(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public int addAndReturn(int a, int b){
//        int sum = a + b;
//        return sum;
        return a + b;
    }
}