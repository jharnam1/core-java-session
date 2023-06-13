package day11;

//Abstract classes refers to classes that cannot be instantiated, but rather are designed for use as base classes
//Abstract methods are methods that do not have an implementation and are declared within abstract classes.

public class MainApplication {
    public static void main(String[] args) {

        Animal cow = new Cow ("Mammal");
        Animal sheep = new Snake("Reptile");

        cow.displayInfo();
        sheep.displayInfo();
    }
}
