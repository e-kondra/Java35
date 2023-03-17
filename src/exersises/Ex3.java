package exersises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*
        Write a program that, based on the variable: income (double), will
        calculate the amount of personal income tax due and write it to the
        console.
        The tax is calculated according to the following rules:
        • up to 85,528.00 tax is 18% of the base minus 556.02,
        • from 85,528.00 tax is 14,839.02 + 32% of the surplus over
        85,528.00.
        Get the income from the user in the console using the Scanner class.
         */
        final double taxConst = 85528.00d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your income: ");

        double income = scanner.nextDouble();
        double tax;
        if (income < taxConst){
            tax = income/100*18 - 556.02;
        } else{
            tax = 14839.02 + (income-taxConst)/100*32;
        }
        System.out.printf("Your tax is %.2f", tax);
    }
}
