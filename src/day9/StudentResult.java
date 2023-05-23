package day9;

import java.util.Locale;
import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide student name");
        String name = sc.nextLine();

        System.out.println("Please provide student age");
        String age = sc.nextLine();

        System.out.println("Please provide student gender(male/female/others: ");
        String gender = sc.nextLine();

        Student student = new Student(name, age, Gender.valueOf(gender.toUpperCase()));
        System.out.println(student.getName() + "'s score");

        System.out.println("Please provide the marks that student got");

        System.out.println("Provide mark for Maths");
        float maths = sc.nextFloat();

        System.out.println("Provide mark for Science");
        float science = sc.nextFloat();

        System.out.println("Provide mark for Computer");
        float computer = sc.nextFloat();

        System.out.println("Provide mark for English");
        float english = sc.nextFloat();

        System.out.println("Provide mark for Social");
        float social = sc.nextFloat();

        System.out.println("Provide mark for Economics");
        float economics = sc.nextFloat();

        sc.close();

        float total = maths + science + computer + english + social + economics;

        float percentage = (total / 600) * 100;

        System.out.println("Percentage= " + percentage);


        boolean checkWithRange = percentage >= 80 && percentage <= 90;
        System.out.println(checkWithRange);

        String message = (percentage >= 80 && percentage <= 90) ? "Is between 80 and 90" : "Not between 80 and 90";
        System.out.println(message);

        //condition

        if (percentage < 40){
            System.out.println("Failed");
        }

        if (percentage >=40 && percentage <=60){
            System.out.println("Second division");
        }

        if (percentage >=60 && percentage <=80){
            System.out.println("First division");
        }


        if (percentage >=80 && percentage <=100){
            System.out.println("Distinction");
    }
        if (percentage <0 || percentage > 100){
            System.out.println("Invalid input");
        }
    }
}
