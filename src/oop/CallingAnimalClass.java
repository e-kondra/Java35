package oop;

public class CallingAnimalClass {
    public static void main(String[] args) {
        Animal cat = new Animal("Maine Coon", 12, 6.350d);
        cat.setType("Persian");
        cat.printAnimalInfo();

        Animal dog = new Animal("bull terrier", 30);
        dog.printAnimalInfo();

        Animal hamster = new Animal();
        hamster.setWeight(0.150d);
        hamster.printAnimalInfo();
    }
}
