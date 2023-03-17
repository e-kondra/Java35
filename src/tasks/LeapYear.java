package tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");

        int year = scanner.nextInt();
        System.out.println(determineLeapYear(year));

    }
    public static String determineLeapYear(int year){
        String result;
        if (year < 0) {
            result = "Invalid input";
        } else if(year > 2100) {
            result = "You are looking too far in the future, live for today";
        } else {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                result = year + " is a leap year";
            } else {
                result = year + " isn't a leap year";
            }
        }
        return result;
    }
}
