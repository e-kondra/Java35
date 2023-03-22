package oop;

public class CallingTriangleClass {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.setSide1(12.0d);
        triangle.setSide2(15.36d);
        triangle.setSide3(8.5d);

        System.out.printf("Triangle with sides: %f %f %f \n",triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
        System.out.println("Area of triangle is " + triangle.areaTriangle());
    }
}
