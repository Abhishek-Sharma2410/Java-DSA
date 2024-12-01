public class getterssetters{
    public static void main(String args[]){
        Person p1 = new Person();
        p1.setDetails("Abhishek Sharma", "Bright", "Male");
        p1.getDetails();
    }
}

class Person{
    String name;
    String color;
    private String gender;
    // This is the setter function 
    void setDetails(String nname, String ncolor, String ngender){
        name = nname;
        color = ncolor;
        gender = ngender;
    }
    // This is the getter function
    void getDetails(){
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println("This is private but the function inside that class can access it "+this.gender);
    }
}