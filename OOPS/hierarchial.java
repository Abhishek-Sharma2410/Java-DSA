public class hierarchial{
    public static void main(String args[]){
        Bird b1 = new Bird();
        b1.feather = 2;
        b1.eats();
        b1.breathes();
        b1.fly();
        
        Fish f1 = new Fish();
        f1.fins = 2;
        f1.breathes();
        f1.swim();
    }
}

class Animal{
    String name;
    String maxAge;
    
    void eats(){
        System.out.println("Eats");
    }
    void breathes(){
        System.out.println("Breathes");
    }
}

class Bird extends Animal{
    int feather;
    void fly(){
        System.out.println("Can fly");
    }
}

class Fish extends Animal{
    int fins;
    
    void swim(){
        System.out.println("Can Swim");
    }
}


