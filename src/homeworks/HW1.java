package homeworks;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // Using scanner ask user to enter name and year of birth
        // Input:
        //      John, 2000
        // Print out:
        //      "Your name is John and you are 22 years old"
        int year = 1900;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name");
        String name = scanner.nextLine();

        System.out.println("Please, enter your year of birth");
        if(scanner.hasNextInt()){
            year = scanner.nextInt();
        } else {
            System.out.println("This is not a number");
        }
        
        System.out.println("Your name is "+ name + " and you are " + (2023-year) + " years old");
    }
}
