public class constructor{
    public static void main(String args[]){

        // This enables us to initialize the constructor 
        Student s1 = new Student("Abhishek Sharma", 210094);
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
    }
}

class Student{
    String name;
    int roll_no;

    // This is the constructor which is made porpusfullly by us for make it initilizable
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}