public class inheritance{
    public static void main(String args[]){
        Fish nemo = new Fish();
        nemo.name = "nemo";
        nemo.skinColor = "red and white";
        nemo.numberOfFins = 2;
        nemo.eats();
        nemo.swim();
    }
}

class Animal{
    String name;
    String skinColor;

    void eats(){
        System.out.println("Eates the food");
    }

    void breathes(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    int numberOfFins;

    void swim(){
        System.out.println("This animal can swim");
    }
}