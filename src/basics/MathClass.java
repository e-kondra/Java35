package basics;

public class MathClass {
    public static void main(String[] args) {
        float num = 5.6f;
        System.out.println(num);

        //different types of roundings
        //Rounding down
        System.out.println("Floor: " + Math.floor(num));

        //Rounding up
        System.out.println("Ceil:" + Math.ceil(num));

        //rounding according to Math rules
        System.out.println("Round: " + Math.round(num));

        //ABS
        System.out.println("ABS:" + Math.abs(num));

        //Power
        System.out.println("Power: " + Math.pow(num, 2));

        //Max
        System.out.println("Max" + Math.max(num, 0.3f)); //it should take the same data types !!!

        //Max out of 3 values
        System.out.println( "Max out of 3 " + Math.max(Math.max(14, 19), 12));

        //SQRT
        System.out.println("SQRT: " + Math.sqrt(121));

        //Random
        System.out.println("Random " + Math.random()); //between 0.0 to 0.99999
        System.out.println("Random (0-9) " + (int) (Math.random() * 10)); //casting to int
        System.out.println("Random (0-10) " + (int) (Math.random() * 11));
        System.out.println("Random (1-10) " + (int) ((Math.random() * 10) +1));

    }
}
