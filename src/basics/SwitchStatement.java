package basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a grade ");
        int grade = scanner.nextInt();
        switch (grade){
            case 1:
                System.out.println("Very very bad");
                break;
            case 2:
                System.out.println("Very bad");
                break;
            case 3:
                System.out.println("Bad");
                break;
            case 4:
                System.out.println("Normal");
                break;
            default:
                System.out.println("Not bad");
                break;
        }
    }
}
