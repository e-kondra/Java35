package exersises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        /*Write a program that, based on the variables: height - height (int) and
        weight - weight (float), checks whether a person can ride a roller
        coaster.
            If a person is taller than 150cm and does not exceed 180kg, the
        program will write in the console "Fasten your seatbelt!", Otherwise it
        will write in the console "I'm sorry you can't go!".
             Get the data from the user in the console using the Scanner class.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your height: ");
        int height = scanner.nextInt();

        System.out.println("Please, enter your weight");
        float weight = scanner.nextFloat();

        if (height>=150 && weight<=180){
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
        }
    }
}
