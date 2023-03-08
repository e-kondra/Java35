package basics;

import com.sun.jdi.CharValue;

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
        //substrings
        String introduction = "Hello my name is Bob and I'm 18";
        System.out.println(introduction.substring(6));
        System.out.println(introduction.substring(12, 18));

        String BobsAge = introduction.substring(introduction.length()-2).trim();
        System.out.println("Bob is "+ BobsAge + " years old");

        int BobsAgeAsInt = Integer.parseInt(BobsAge);

        if(BobsAgeAsInt >= 18){
            System.out.println("adult");
        }else {
            System.out.println("child");
        }
        //Wrapper class
        int temp1 = 36;
        Integer temp2 = 36;
        System.out.println(temp1);
        System.out.println(temp2);

        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.235645";
        String booleanStrValue = "true";
        String longStrValue = "2323234445454";
        String charStrValue = "h";

        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        boolean bolValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);
        char charValue = charStrValue.charAt(0);
    }
}
