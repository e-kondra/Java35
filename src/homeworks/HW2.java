package homeworks;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        // Using scanner read speed in mp/h
        // Calculate and output speed in km/h
        // Example with input 122.7 mp/h
        // Output --> 122.7 mp/h in km/h would be equal to 197.46651
        final float convert = 1.60934399f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter speed in mp/h");
        if (scanner.hasNextFloat()){
            float miles = scanner.nextFloat();
            System.out.println(miles + "mp/h in km/h would be equal to " + (miles * convert));
        } else {
            System.out.println("You've written a wrong number");
        }





    }
}
