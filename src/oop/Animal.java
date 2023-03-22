package oop;

public class Animal {
    //Fields
    private String type;
    private int avgLifeSpan;
    private double weight;

    //Constructor
    public Animal(String type, int avgLifeSpan, double weight){
        this.type = type;
        this.avgLifeSpan = avgLifeSpan;
        this.weight = weight;
    }

    public Animal(String type, int avgLifeSpan){
        this.type = type;
        this.avgLifeSpan = avgLifeSpan;
    }

    public Animal(){

    }
    public void setType(String type) {
        this.type = type;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printAnimalInfo(){
        System.out.println("Type " + type);
        System.out.println("Average life span " + avgLifeSpan);
        System.out.println("Weight " + weight);
    }
}
