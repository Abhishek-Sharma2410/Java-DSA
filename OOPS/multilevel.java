public class multilevel{
    public static void main(String args[]){
        Human h1 = new Human(20);
        h1.legs = 2;
        System.out.println(h1.totalFingers);
        h1.canThink();
        h1.canWalk();
    }
}

class Animal{
    String name;
    String color;

    void eats(){
        System.out.println("Eats");
    }
    void breathes(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    int legs;

    void canWalk(){
        System.out.println("Can Walk");
    }
}

class Human extends Mammal{
    int totalFingers;

    Human(int fingers){
        this.totalFingers = fingers;
    }
    void canThink(){
        System.out.println("Can Think");
    }
}