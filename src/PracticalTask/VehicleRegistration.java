package PracticalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class VehicleRegistration {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many vehicles do you want to register?");
        int numOfVehicles = scan.nextInt();

        for (int i = 0; i < numOfVehicles; i++){
            System.out.printf("************* Vehicle %s *************\n", i +1);
            System.out.printf("Enter type of vehicle %s: \nPossible values " + Arrays.asList(VehicleType.values()), i +1);
            VehicleType vehicleType = VehicleType.valueOf(scan.next().toUpperCase());
            System.out.printf("Enter brand of vehicle %s: ", i +1);
            String brand = scan.next();
            System.out.printf("Enter engine size of vehicle %s: ", i +1);
            int engineSize = scan.nextInt();
            System.out.printf("Enter horse power of vehicle %s: ", i +1);
            int horsePower = scan.nextInt();
            System.out.printf("Enter engine type of vehicle %s: \nPossible values " + Arrays.asList(EngineType.values()), i +1);
            EngineType engineType = EngineType.valueOf(scan.next().toUpperCase());
            System.out.printf("Enter production year of vehicle %s: ", i +1);
            int productionYear = scan.nextInt();

            switch (vehicleType) {
                case CAR:
                    System.out.printf("Enter number of vehicle doors %s: ", i +1);
                    int numberOfDoors = scan.nextInt();
                    Car car = new Car(brand, engineSize, horsePower, engineType, productionYear, numberOfDoors);
                    vehicles.add(car);
                    break;
                case MOTORCYCLE:
                    Motorcycle motorcycle = new Motorcycle(brand, engineSize, horsePower, engineType, productionYear);
                    vehicles.add(motorcycle);
                    break;
                case TRUCK:
                    System.out.printf("Enter number of additional vehicle trailers %s: ", i +1);
                    int additionalTrailers = scan.nextInt();
                    Truck truck = new Truck(brand, engineSize, horsePower, engineType, productionYear, additionalTrailers);
                    vehicles.add(truck);
                    break;
                default:
                    System.out.printf("Wrong vehicle type: %s", vehicleType);
            }
            System.out.println("********************\n");
        }
        System.out.println("All vehicles\n");
        for(int i = 0; i < vehicles.size(); i ++) {
            System.out.printf("VEHICLE %s\n", i + 1);
            System.out.println("-------------------------\n");
            System.out.println(vehicles.get(i).toString());
            System.out.println("-------------------------\n");
        }
        double sumOfRegistrationPrice = 0;

        for(Vehicle vehicle : vehicles) {
            sumOfRegistrationPrice += vehicle.calculateRegistrationCost();
        }

        System.out.printf("Registration amount for %s vehicles is: " + sumOfRegistrationPrice, vehicles.size());
    }
}
