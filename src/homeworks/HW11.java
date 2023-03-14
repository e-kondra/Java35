package homeworks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {
        /*Create a JAVA program that allows you to enter Personal Number (Example 112233-
        12345) as a String value, and you should get output if this input is following right
        pattern (exactly 6 any numbers followed by exactly one “-” and then exactly 5 more
        any numbers). Don’t worry about other limitations like month in personal code, just
        look for this pattern.*/
        //Personal code
        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        while(again == 'y'){
            System.out.println("Please enter personal number");
            String personalNumber = scanner.nextLine().trim();
            if (Pattern.matches("[0-9]{6}-[0-9]{5}", personalNumber)){
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println("Do you want to check personal number again? y/n");
            again = scanner.next().charAt(0);
            scanner.nextLine();
        }
    }
}
