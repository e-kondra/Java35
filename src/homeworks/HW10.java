package homeworks;

import java.util.Arrays;
import java.util.Collections;

public class HW10 {
    public static void main(String[] args) {
        int [] myArray = {118,2,3,45,55,6,20,7,89,25,10,11,122,69,0};
        System.out.println("Original array: " + Arrays.toString(myArray));
        int n;
        for(int i = 0; i < myArray.length/2; i++){
            n = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = n;
        }
        System.out.println("Reversed array: "+ Arrays.toString(myArray));
    }
}
