package Assignment;

import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

    public static void main(String[] args) {

        //Given array list
        String animalArray[] = {"Dog", "Cat", "Lion"};
        System.out.println("Animal Array: " + Arrays.toString(animalArray));

        //Converting it to collection
        List animalList = Arrays.asList (animalArray);
        System.out.println("Collection: " + animalList);
    }
}
