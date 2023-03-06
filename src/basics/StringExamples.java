package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your name");
//
//        //how to compare strings
//        String name = scanner.nextLine().toUpperCase().trim();
//
//        if(name.equals("BOB")){
//            System.out.println("equals");
//        }else{
//            System.out.println("no equals");
//        }
        //combine String values
        String text1 = "This is ";
        String text2 = "a new text";
        String text3 = ". Wow!!!";

        System.out.println(text1 + text2);

        String result = text1.concat(text2).concat(text3);
        System.out.println(result);
        System.out.println(result.length());

        //indexOf()
        System.out.println(result.indexOf("is",4));
        //charAt()
        System.out.println(result.toLowerCase().charAt(0));
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));
        //Replace
        String greeting = "This is holiday time.\nHave a nice holiday";
        System.out.println(greeting.replaceAll("holiday", "Christmas"));
        System.out.println(greeting.replaceFirst("holiday", "Easter"));
        System.out.println(greeting.replace("h","kh"));

    }
}
