public class methodoverriding{
    public static void main(String args[]){
        Animal a = new Animal();
        a.eats();
        Deer d = new Deer();
        d.eats();
    }
}

class Animal{
    void eats(){
        System.out.println("Eats Anything ; Omnivore");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass only : Herbivorus");
    }
}
