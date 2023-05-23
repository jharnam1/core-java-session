package day9;

public class Student {
    private String name;
    private String age;
    private Gender gender;

    public Student(String name, String age, Gender gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }



}
