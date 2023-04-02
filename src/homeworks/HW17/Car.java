package homeworks.HW17;

public class Car extends Vehicle{
    private Boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
        super(fuel,  fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }
    @Override
    public float maxDistance(float fuel, float fuelUsage) {
        return super.maxDistance(fuel, fuelUsage);
    }

    public float maxDistance(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        if (airConditioner){
            fuelUsage += fuelUsage * 0.1f;
        }
        return fuel / (fuelUsage + fuelUsage/100 * 5 * passengers) * 100;
    }
}
