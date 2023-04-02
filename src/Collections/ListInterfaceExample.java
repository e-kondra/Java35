package Collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        //Declaring ArrayList
        ArrayList<String> car = new ArrayList<>();

        //add elements
        car.add("Volvo");
        car.add("BMW");
        car.add("VW");
        car.add("Jeep");
        car.add("BMW");

        //print out all elements
        System.out.println(car);

        //Get element by index
        System.out.println(car.get(0));

        //add new element at specific index
        car.add(1, "Tesla");
        System.out.println(car);

        //ArrayList<String> car2 = new ArrayList<>("Toyota","Mersedes");
        //car.addAll(<"Toyota","Mersedes">);

        car.set(3, "Toyota");
        System.out.println(car);

        //remove element
        car.remove(5);
        System.out.println(car);
        car.remove("BMW");
        System.out.println(car);

        //size
        System.out.println(car.size());

        //deleting all elements
        car.clear();
        System.out.println(car);
    }
}
