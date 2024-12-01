public class hybrid{
    public static void main(String args[]){
        Peacock p1 = new Peacock();
        p1.name = "Hans";
        p1.color = "blue and green";
        System.out.println(p1.name);
        System.out.println(p1.color);
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

class Bird extends Animal{
    int feather;

    void canFly(){
        System.out.println("Can fly");
    }
}

class Fish extends Animal{
    int fins;

    void canSwin(){
        System.out.println("can Swim");
    }
}

class Mammal extends Animal{
    int legs;

    void canWalk(){
        System.out.println("Can Walk");
    }
}

class Peacock extends Bird{
    int size;

    void sound(){
        System.out.println("Sweet Song");
    }
}