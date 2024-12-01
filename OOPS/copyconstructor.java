public class copyconstructor{
    public static void main(String args[]){
        Student s1 = new Student("Abhishek Sharma", 21006194, "Abhishek@1234");

        // This is the copy constructor
        Student secYear = new Student(s1);
        secYear.printDetails();
    }
}

class Student{
    String name;
    int roll;
    private String password;

    // This constructor is called copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }

    Student(String name, int roll, String password){
        this.name = name;
        this.roll = roll;
        this.password = password;
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.password);
    }
}