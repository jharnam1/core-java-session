//Immutable classes mean that their state cannot be altered once an object is created.
//The steps in creating an immutable class are:
//1.	Your class should be final so that other classes cannot extend it.
//2.	All fields should be private to prevent direct access.
//3.	It is necessary to declare class members private to prevent direct access.
//4.	Setters should not be provided for variables.
//5.	Parameterized constructors should initialize all the fields by performing a deep copy so that they cannot be modified with object references.
//6.	Use cloning to return a copy of the object instead of the actual reference in the getter methods.

package day7;

 public final class Employee {

        private String name;
        private int idNumber;


        public Employee(String name, int idNumber) {
            this.name = name;
            this.idNumber = idNumber;
        }

     public String getName() {
         return name;
     }

        public int getIdNumber() {
            return idNumber;
        }

                public static void main(String[] args) {

                    // create object of Immutable
                    Employee obj = new Employee("John:",456);

                    System.out.println(obj.getName());
                    System.out.println(obj.getIdNumber());


         }
        }




