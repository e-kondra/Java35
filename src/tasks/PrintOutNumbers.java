package tasks;

import java.util.Scanner;

public class PrintOutNumbers {
    public static void main(String[] args) {
        //Write an application that asks for user an integer value (it can be positive or negative)
        // You should print out all numbers starting from the one user entered till 0 including
        // Example:
        // Input : 5    Output: 5 4 3 2 1 0
        // Input : -8   Output: -8 -7 -6 -5 -4 -3 -2 -1 0
        // Input : 0    Output: 0

        Scanner scanner = new Scanner(System.in);
        int entered_num = scanner.nextInt();
        int n = -1;
        if (entered_num < 0){
            n=1;
        }
        for(int i = entered_num; Math.abs(i) >= 0; i+=n ){
            System.out.print(i + " ");
            if (i==0){
                break;
            }
        }
    }
}
