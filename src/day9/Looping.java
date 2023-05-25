package day9;

public class Looping {
    public static void main(String[] args) {

        //while loop example
        String message = "Hi";
        int count = 2;
        while (count < 6){
            System.out.println(message);
            count++;
        }


        //do while loop example
        String result = "Hello";
        int number = 1;

        do{
            System.out.println(result);
            number++;
        } while (number < 6);



        //for loop example
        String answer = "Hey";
        for(int num = 0; num<6; num++){
            System.out.println(answer);
        }



        //Question 12
        int N = 4;
        String output = "";
        if (N % 2 == 0){
            for (int i = 1; i<=N-1; i++){
                output += "a";

            }
            output += "b";
        }else{
            for (int i = 1; i<=N; i++){
                output += "a";
        }
    }
        System.out.println(output);
} }
