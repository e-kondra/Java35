package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        //Declaring array that will store 3 elements of type String
        String[] names = new String[3];

        //Access value from array
        System.out.println(names[0]);

        //set elements values using each elements index
        names[0] = "Katya";
        names[2] = "Ksenia";
        names[1] = "Vova";

        //Get Length of array
        System.out.println(names.length);

        //second way to declare and init array at the same time
        String[] dreamCars = new String[]{"Tesla", "Ferrari", "Opel", "BMW"};

        //print  out all array's values
         for(int i=0; i<dreamCars.length; i++){
             System.out.println((i+1) + ". " +dreamCars[i]);
         }
        // Same idea but using for-each loop
        for(String car : dreamCars){
            System.out.println(car);
        }
        System.out.println(Arrays.toString(dreamCars));
        Arrays.sort(dreamCars);
        System.out.println(Arrays.toString(dreamCars));

        //we have an array of some amount int values
        //we need to give a comment for element in the array
        //If the values odd or even
        int listOfNumbers[] = new int[]{234,5,45,33,69,145,225,234};
        Arrays.sort(listOfNumbers);
        for(int number : listOfNumbers){
            if (number%2 == 0){
                System.out.println(number + " - even number");
            }else{
                System.out.println(number + " - odd number");
            }
        }
    }
}
