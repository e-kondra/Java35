package oop.inheritance;

class Parent{
    public void printParent(){
        System.out.println("This is a parent class");
    }
}

class Child extends Parent {

    @Override
    public void printParent() {
        System.out.println("This is a child class");
        super.printParent();
        System.out.println("This is a child class");
    }
    public void printChild(){
        System.out.println("--This is a child class");
    }
}

public class InheritanceIntro {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printParent();

        Child child = new Child();
        child.printParent();
        child.printChild();
    }
}
