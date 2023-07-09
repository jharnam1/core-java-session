package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class DescendingOrderList {

    public static void main(String[] args) {
        //Student list
        List<Student> studentList = new ArrayList<>();

        Student st1 = new Student("Jina", 1, 945);
        Student st2 = new Student("Mac", 2, 800);
        Student st3 = new Student("George", 3, 732);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        //Sorting in descending order
        TreeSet<Student> sortedStudentList = new TreeSet<>(Collections.reverseOrder());
        sortedStudentList.addAll(studentList);

        //Print sorted list
        System.out.println("Sorted list of student:");
        for (Student student : sortedStudentList) {
            System.out.println(student);
        }
        System.out.println();



        //String list
        List<String> stringList = new ArrayList<>();
        stringList.add("Alana");
        stringList.add("John");
        stringList.add("David");

        // Sorting in descending order
        TreeSet<String> sortedStringList = new TreeSet<>(Collections.reverseOrder());
        sortedStringList.addAll(stringList);

        // Print the sorted string list
        System.out.println("Sorted list of String :");
        for (String str : sortedStringList) {
            System.out.println(str);

        }

    }
}