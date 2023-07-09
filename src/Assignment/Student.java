package Assignment;

public class Student implements Comparable<Student> {

    private String name;
    private int studentId;
    private int points;

    public Student() {
    }

    public Student(String name, int studentId, int points) {
        this.name = name;
        this.studentId = studentId;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getPhoneNumber() {
        return points;
    }

    public void setPhoneNumber(int points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", points=" + points +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

