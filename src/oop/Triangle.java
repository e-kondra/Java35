package oop;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    //Setters
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    //Getters
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    private boolean isValid(){
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    private double getHalfOfPerimeter(){
        return (side1 + side2 + side3) / 2;
    }

    public double areaTriangle(){
        if (isValid()){
            double halfPer = getHalfOfPerimeter();
            return Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));
        }
        System.out.println("Triangle is not valid");
        return 0;
    }
}
