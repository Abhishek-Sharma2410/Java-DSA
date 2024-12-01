public class multipleinheritance{
    public static void main(String args[]){
        Bear b1 = new Bear();
        b1.eatsGrass();
        b1.eatsFlesh();
    }   
}

interface Herbivore{
    void eatsGrass();
}

interface Omnivore{
    void eatsFlesh();
}

// This is a child class which is implementing both Herbivore and Omnivore so this is the example of multiple Inheritance
class Bear implements Herbivore, Omnivore{
    public void eatsGrass(){
        System.out.println("Bear is Herbivore");
    }
    public void eatsFlesh(){
        System.out.println("Bear eats Fleshh too !");
    }
}