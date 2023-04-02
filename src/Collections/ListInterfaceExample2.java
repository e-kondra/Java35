package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {
        //Example1
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(32);
        System.out.println(numbers1);

        ArrayList<Integer> numbers2 = new ArrayList<>(numbers1);
        numbers2.addAll(numbers1);
        numbers2.add(12);
        numbers2.add(36);

        System.out.println(numbers2);

        //Example2
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test1");
        arrayList.add("Test2");
        arrayList.add("Test3");

        //For loop
        for(int i = 0; i< arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        //For each
        for( String el: arrayList){
            System.out.println(el);
        }

        //linkedList

        LinkedList <String> car = new LinkedList<>();
        car.add("Audi");
        car.add("Opel");
        car.add("VW");
        System.out.println(car);

        //LastElement
        System.out.println(car.get(car.size()-1));
        System.out.println(car.getLast());

        //FirstElemnt
        System.out.println(car.get(0));
        System.out.println(car.getFirst());

        LinkedList <Integer> numbers = new LinkedList<>();
        for(int i = 1; i <= 100; i++){
            numbers.add(i);
        }
        System.out.println(numbers);

    }
}
