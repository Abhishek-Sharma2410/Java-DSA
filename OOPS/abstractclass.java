public class abstractclass{
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eats();
        h1.walk();
        
        Chicken c1 = new Chicken();
        c1.eats();
        c1.walk();
    }
}

abstract class Animal{
    // Non - Abstract Functions 
    void eats(){
        System.out.println("Can Eat");
    }
    
    // Abstract Function doesn't need to be implemented. Only idea has been given
    abstract void walk();
}

class Horse extends Animal{
    // This is the implementation of abstract function that is menadatory
    void walk(){
        System.out.println("Horse can walk on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}