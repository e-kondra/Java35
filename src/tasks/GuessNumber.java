package tasks;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter max random number");
        int max = scanner.nextInt();
        int rand = (int)(Math.random() * (max+1));
        //System.out.println("Generated random number = " + rand);

        int guess;
        System.out.println("Random number between 0 and " + max);
        do{
            System.out.println("Guess the random number");
            guess = scanner.nextInt();
            if(guess > rand){
                System.out.println("Your number is more than random number");
            } else if (guess < rand){
                System.out.println("Your number is less than random number");
            }
        } while (guess != rand);
        System.out.println("Congratulations! You won!");
    }
}
