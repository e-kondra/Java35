package homeworks.HW17;

import java.util.Scanner;

public class VehicleCalling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle");
        float fuelAmount = scanner.nextFloat();
        System.out.println("Enter your vehicle's fuel usage per 100 km");
        float fuelUsage = scanner.nextFloat();
        System.out.println("Enter how many passengers will be in the vehicle");
        int passengers = scanner.nextInt();
        System.out.println("Will you turn on air conditioner? y/n");
        char conditionerAnswer = scanner.next().toLowerCase().charAt(0);
        boolean airConditioner = false;
        if (conditionerAnswer == 'y'){
            airConditioner = true;
        }
        //Main Task
        Vehicle vehicle = new Vehicle(fuelAmount, fuelUsage, passengers);
        System.out.printf("Your vehicle can drive maximum %.2f kilometers \n",
                    vehicle.maxDistance(fuelAmount, fuelUsage, passengers));

        //Additional Task
        Car car = new Car(fuelAmount, fuelUsage, passengers, airConditioner);
        System.out.printf("Your vehicle can drive maximum %.2f kilometers \n",
                    car.maxDistance(fuelAmount, fuelUsage, passengers, airConditioner));
    }
}
