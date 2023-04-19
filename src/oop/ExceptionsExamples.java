package oop;

public class ExceptionsExamples {
    public static void main(String[] args) {
        try{
            int [] num = {1,2,3};
            System.out.println(num[3]);
        } catch (Exception e){
            System.out.println("Something was wrong");
            System.out.println(e);
        }

        //second example
        try{
            //int num1 = 5/0;
            int[] num = {1,2,3,4};
            System.out.println(num[4]);
        }catch (ArithmeticException | OutOfMemoryError e){
            System.out.println("There was problem with some math operations");
            System.out.println("Exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something was wrong with Array's index");
        }catch (Exception e){
            System.out.println("Something was wrong");
        }finally {
            System.out.println("Finally block");
        }

    }
}
