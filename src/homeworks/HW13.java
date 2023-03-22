package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW13 {
    public static void main(String[] args) {
        /*Write a Java program to find arrays max value and min value. Write two methods
        max() and min() that take in as an argument int type array. Loop through array and
        find max value in max() method and min value in min() method. Both methods
        should return int value.
        Example method declaration getting array as argument
         */
        int arrayLength = 12;
        int [] arrayInt = new int[arrayLength];
        //generate intArray
        for (int i = 0; i < arrayLength; i++){
            arrayInt[i] = (int) (Math.random() * 110);
        }

        System.out.println("Original Array: " + Arrays.toString(arrayInt));
        System.out.println("Maximum value for the above array: " + max(arrayInt));
        System.out.println("Minimum value for the above array: " + min(arrayInt));

    }

    public static int max(int [] intArray){
        //return max value of int array
        int maxNum = intArray[0];
        for(int i = 1; i < intArray.length; i ++){
            if (intArray[i] > maxNum){
                maxNum = intArray[i];
            }
        }
        return maxNum;
    }
    public static int min(int [] intArray){
        //return min value of int array
        int minValue = intArray[0];
        for(int i = 1; i < intArray.length; i ++){
            if (intArray[i] < minValue){
                minValue = intArray[i];
            }
        }
        return minValue;
    }

}
