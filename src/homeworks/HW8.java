package homeworks;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sumOfElements = 0;

        System.out.println("Please, enter a size of the array");
        int sizeOfArray = scanner.nextInt();

        float [] arrayOfNumbers = new float[sizeOfArray];
        System.out.println("Enter the grades of the array one by one");

        for(int i = 0; i < sizeOfArray; i++){
            System.out.println("Please enter grade number: " + (i+1));
            arrayOfNumbers[i] = scanner.nextFloat();
            sumOfElements += arrayOfNumbers[i];
        }

        System.out.printf("Average grade is %.3f \n", sumOfElements/sizeOfArray);
        System.out.printf("There was passed %d values \n", sizeOfArray);
    }
}
