package exersises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /*
        Write a program that based on the variable temperature in degrees
        Celsius - tempInCelsius (float), will calculate the temperature in degrees
        Farhenheit (degrees Fahrenheit = 1.8 * degrees Celsius + 32.0) and write
        it in the console.
        Get the temperature from the user in the console using the Scanner class.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature in degrees Celsius");

        float tempInCelsius = scanner.nextFloat();
        System.out.printf("Temperature in degrees Fahrenheit %.2f", (1.8 * tempInCelsius + 32.0));
    }
}
