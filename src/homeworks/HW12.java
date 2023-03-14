package homeworks;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        /*    Create a JAVA program that allows you to enter a String value and gives you output if
        what you entered is palindrome or not.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word(s) for check: ");

        //prepare entered string (convert to lower case + eliminate all spaces)
        String checkedString = scanner.nextLine().toLowerCase().replaceAll(" ","");

        //call methods that return result of check (true or false)
        if (checkPalindromeWithoutReverse(checkedString)
                && checkPalindromeWithReverse(checkedString)
                && checkPalindromeWithArray(checkedString)){
            System.out.println("It's a palindrome");
        } else{
            System.out.println("It's not a palindrome");
        }

    }
    public static Boolean checkPalindromeWithoutReverse(String strForCheck){
        int j = 0;
        //compare chars of String from different sides from ends to middle
        for(int i = strForCheck.length()-1; i >= strForCheck.length()/2 ; i--, j++){
            if(strForCheck.charAt(i) != strForCheck.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static Boolean checkPalindromeWithArray(String strForCheck){
        char [] charArray = new char[strForCheck.length()];
        int j = 0;
        //create an Array consisted of strings chars in reversed order
        for(int i = strForCheck.length()-1; i >= 0; i--, j++){
            charArray[j] = strForCheck.charAt(i);
        }
        //compare chars in Array with chars in String
        for(int i = 0; i < strForCheck.length(); i++){
            if(strForCheck.charAt(i) != charArray[i]){
                return false;
            }
        }
        return true;
    }
    public static Boolean checkPalindromeWithReverse(String strForCheck){
        StringBuffer stringBuffer = new StringBuffer(strForCheck);
        //use inbuilt method
        stringBuffer.reverse();
        //create new String from StringBuffer
        String reversedStr = new String(stringBuffer);
        //compare two strings
        return strForCheck.equals(reversedStr);
    }

}
