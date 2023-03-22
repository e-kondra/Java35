package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HW14 {
   /* Create a Method that takes two arguments: the original price and the discount
    percentage as float and returns the final price after the discount.
    Your answer should be rounded to two decimal places.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a price");
        float price = scanner.nextFloat();

        System.out.println("Please enter a discount");
        float discount = scanner.nextFloat();
        DecimalFormat df = new DecimalFormat("0.00");

        if (isValid(discount)){
            System.out.println("Special price: " + df.format(CalcDiscountPrice(price, discount)));
        }
    }

    public static boolean isValid(float disc){
        return disc <= 100;
    }
    //discount method
    public static float CalcDiscountPrice(float price, float discount){
        return price/100 * (100-discount);
    }

}
