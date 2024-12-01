public class classesandobjects{
    public static void main(String args[]){

        // This is the method of creating a new object of a class
        Animal elephant = new Animal();

        // This is the way to acess the function 
        elephant.sound("snorts");
        elephant.changeType("Large");
        elephant.changeMaxAge(60);
        // This we accessed the function of the Animal class as we used the length() function of String class
        // elephant.printDetails();

        // This is the way to access the property of the class like we have accessed the array.length property
        elephant.type = "very larger";


        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.company = "Reynolds";
        // p1.printDetails();

        p1.changeColor("Red");
        p1.changeCompany("Rorito");
        p1.printDetails();
    }
}

// This is the way in which you create the class in java
class Animal{

    // These three are the properties of the Animal Class
    String type;
    int maxAge;
    String sound;

    // These are the functions of the Animal class
    void sound(String Sound){
        sound = Sound;
    }
    void changeType(String newType){
        type = newType;
    }
    void changeMaxAge(int newAge){
        maxAge = newAge;
    }

    void printDetails(){
        System.out.println(this.type);
        System.out.println(this.maxAge);
        System.out.println(this.sound);
    }
}

class Pen{
    String color;
    String company;

    void changeColor(String newColor){
        color = newColor;
    }
    void changeCompany(String newCompany){
        company = newCompany;
    }
    void printDetails(){
        System.out.println(this.color);
        System.out.println(this.company);
    }
}