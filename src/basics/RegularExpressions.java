package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        //Examples
        Pattern pattern = Pattern.compile("a+b"); //one or more "a"
        Matcher matcher = pattern.matcher("ab");
        System.out.println(matcher.matches());
        System.out.println(matcher.find());

        //Any 3 symbols that would be any lower case letter or number from 5 to 9
        System.out.println(Pattern.matches("[a-z5-9@]{3}","h6@"));

        //2 Uppercase letters followed by at least 2 lower case letters and then 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}","ASghbn236"));
        //2 to 7 any letters or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,7}", "gh2bn"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your cars plate number");
        String plateNumber = scanner.nextLine();

        //2 uppercase letters followed by "-" symbol and then 2 to 4 numbers
        if (Pattern.matches("[A-Z]{2}-[0-9]{2,4}", plateNumber)){
            System.out.println("Your plate number is valid");
        }else {
            System.out.println("Your plate number is not valid");
        }

    }

}
