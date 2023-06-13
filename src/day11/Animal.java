package day11;


public abstract class Animal {
    private String type;


    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Type = " + getType());
        System.out.println("Sound = ");
        makeSound() ;

    }
}