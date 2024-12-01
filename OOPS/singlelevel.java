public class singlelevel{
    public static void main(String args[]){
        Human h1 = new Human();
        h1.skinColor = "White";
        h1.name = "Abhishek Sharma";
        h1.legs = 2;
        h1.printDetails();
    }
}

class Animal{
    String name;
    String skinColor;
    int legs;

    void eats(){
        System.out.println("This type of Animal can eats");
    }
}

class Human extends Animal{
    boolean hasHorns;

    void canWalk(){
        System.out.println("This type of Animal can walk");
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(this.skinColor);
        System.out.println(this.legs);
        eats();
        canWalk();
    }
}