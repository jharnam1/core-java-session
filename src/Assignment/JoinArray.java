package Assignment;

import java.util.ArrayList;

public class JoinArray {


    public static void main(String[] args) {

        //ArrayList 1
        ArrayList <String> list1 = new ArrayList<String>();
        list1.add ("Toyota");
        list1.add ("Ford");
        list1.add ("Nissan");

        //ArrayList 2
        ArrayList <String> list2 = new ArrayList<String>();
        list2.add ("Honda");
        list2.add ("Chevrolet");
        list2.add ("Hyundai");

        //Join two Arraylists
        list1.addAll(list2);
        System.out.println("New Array by joining two Arraylist into one = " + list1);

    }
}


