package oop.abstraction;

abstract class Animal{
    protected String name;
    //Regular method
    public void sleep(){
        System.out.println("zzzz");
    }
    //Abstract method
    public abstract void animalSound();

}
class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Hriu-hriu");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        //Cannot create an object from abstract class
        //Animal animal1 = new Animal();

        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();

    }
}
