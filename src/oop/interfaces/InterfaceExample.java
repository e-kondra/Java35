package oop.interfaces;

interface Bug{
    public final String name = "Test";
    public void bugSound();
    public void bugSize();
}

class Ant implements Bug, Location{

    public void bugSize() {
        System.out.println("Small");
    }

    public void bugSound() {
        System.out.println("tssss");
    }

    public void location() {
        System.out.println("Forest");
    }
}

interface Location{
    public void location();
}


public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSize();
        ant.bugSound();
    }
}
