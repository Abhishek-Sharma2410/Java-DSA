public class statickeyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setDetails("Abhishek Sharma", 21006194, "Bareilly College Bareilly");
        s1.getDetails();

        Student s2 = new Student();
        s2.name = "Amit Rathore";
        s2.getDetails();
        
        Student s3 = new Student();
        s3.name = "Aditya Shukla";
        s3.getDetails();
    }
}

class Student{
    String name;
    int roll;
    static String schoolName;

    void setDetails(String name, int roll, String schoolName){
        this.name = name;
        this.roll = roll;
        this.schoolName = schoolName;
    }
    void getDetails(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.schoolName);
    }
}