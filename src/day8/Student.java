//Assignment 9

package day8;

public class Student {

    private static int extraPoints;

    public static void pointsIncreased(){
       // this.extraPoints = this.extraPoints + 1;
        extraPoints++;

    }

    public static void pointsDecreased(){
       // this.extraPoints = this.extraPoints - 1;
        extraPoints--;

    }

    public static int getExtraPoints(){
        return extraPoints;
    }
}
