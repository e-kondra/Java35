package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Bob");
        names.add("Anna");
        names.add("Lian");
        names.add("Lian");

        System.out.println(names);

        //remove elements
        names.remove("Bob");
        System.out.println(names);

        //size
        System.out.println(names.size());

        //Contains
        System.out.println(names.contains("Bob"));
        System.out.println(names.contains("Lian"));

        //Iterate
        for(String name : names){
            System.out.println(name);
        }

        //Example 2

        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("intSet1 : " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2 : " + intSet2);

        //Find union
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("union before : " + union);
        union.addAll(intSet2);
        System.out.println("union after : " + union);

        //Find intersection
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("intersection : " + intersection);

        //Find difference for intSet1
        HashSet<Integer> difference = new HashSet<>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("difference : " + difference);

        //Find difference for intSet2
        HashSet<Integer> difference2 = new HashSet<>(intSet2);
        difference2.removeAll(intSet1);
        System.out.println("difference2 : " + difference2);

        //all differences
        HashSet<Integer> diffAll = new HashSet<>(difference);
        diffAll.addAll(difference2);
        System.out.println("All differences : " + diffAll);

        //LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Italy");

        System.out.println(linkedHashSet);
        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);

    }
}
