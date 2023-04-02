package homeworks.HW17;

public class Vehicle {
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance(float fuel, float fuelUsage){
        return fuel/ fuelUsage * 100;
    }
    public float maxDistance(float fuel, float fuelUsage, int passengers){
        return fuel / (fuelUsage + fuelUsage/100 * 5 * passengers) * 100;
    }
}
