package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter tree size: ");
        int sizeOfTree = scanner.nextInt();

        int numberOfSpaces = sizeOfTree - 1;
        int numberOfStars = 1;

        // Print out tree lines
        for(int i = 0 ; i < sizeOfTree; i++){
            for( int m = 0; m < numberOfSpaces; m++){
                System.out.print(" ");
            }
            for( int n = 0; n < numberOfStars; n++){
                System.out.print("*");
            }
            System.out.println();
            numberOfStars += 2;
            numberOfSpaces--;
        }
        //Print out a trunk of tree line
        for( int m = 0; m < sizeOfTree - 1; m++) {
            System.out.print(" ");
        }
        System.out.print("#");
    }
}
