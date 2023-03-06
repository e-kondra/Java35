package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        /*
        Create a JAVA program that allows you to enter a size of an array (type int). Then ask
        for user to enter each element one by one.
        - Ask for user to enter a positive number that will be the arrays size
        - Create an empty array that will contain int data type values in size of entered value
        - Using for loop ask user to enter array elements one by one
        - Print out all array elements
        - Print out sum of all elements in the array
        */
        Scanner scanner = new Scanner(System.in);
        int [] arrayOfNumbers;
        int sumOfElements = 0;

        System.out.println("Please, enter a size of an array");
        int sizeOfArray = scanner.nextInt();

        arrayOfNumbers = new int[sizeOfArray];
        System.out.println("Enter the elements of the array one by one");

        for(int i = 0; i < arrayOfNumbers.length; i++){
            System.out.println("Please enter element number " + (i+1));
            arrayOfNumbers[i] = scanner.nextInt();
            sumOfElements += arrayOfNumbers[i];
        }

        System.out.println("Source Array: " + Arrays.toString(arrayOfNumbers));
        Arrays.sort(arrayOfNumbers);
        System.out.println("Sorted Array: " + Arrays.toString(arrayOfNumbers));
        System.out.println("Sum of elements: " + sumOfElements);
    }
}
