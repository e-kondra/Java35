package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Declaring 2D array with 2 rows and 5 columns
        String[][] dreamCars = new String[2][5];

        dreamCars[0][0] = "Audi";
        dreamCars[0][1] = "BMW";
        dreamCars[0][2] = "Opel";
        dreamCars[0][3] = "Volvo";
        dreamCars[0][4] = "Cadillac";
        dreamCars[1][0] = "Lamborghini";
        dreamCars[1][1] = "Ferrari";
        dreamCars[1][2] = "Saab";
        dreamCars[1][3] = "Subaru";
        dreamCars[1][4] = "McLaren";

        //How many rows
        System.out.println(dreamCars.length);
        //how many columns
        System.out.println(dreamCars[0].length);

        for (int i = 0; i < dreamCars.length; i++){
            System.out.println(Arrays.toString(dreamCars[i]) );
            for (int n = 0; n < dreamCars[i].length; n++){
                System.out.print(dreamCars[i][n] + " ");

            }
            System.out.println();
        }

    }
}
