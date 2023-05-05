
package PracticalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class VehicleRegistration {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        int numberOfVehicles;
        while (true) {
            System.out.println("How many vehicles would you like to register?");
            if (scan.hasNextInt()) {
                numberOfVehicles = scan.nextInt();
                break;
            } else {
                System.out.println("Please enter a valid (numerical) value.");
                scan.next();
            }
        }

        for (int i = 0; i < numberOfVehicles; i++){
            System.out.printf("Vehicle %s :\n", i+1);


            VehicleType vehicleType;

            do {
                try {
                    System.out.printf("Enter type of vehicle %s: \nPossible values " + Arrays.asList(VehicleType.values()), i +1);
                    vehicleType = VehicleType.valueOf(scan.next().toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input. Input must be the type from created list. Please enter valid input.");
                    scan.next();
                }
            } while (true);


            System.out.printf("Enter the brand/model of the vehicle %s: ", i+1);
            String brand = scan.next();



            EngineType engineType;
            String input;

            do {
                System.out.printf("Enter engine type of vehicle %s: \nPossible values: %s\n", i+1, Arrays.asList(EngineType.values()));
                input = scan.next().toUpperCase();
                try {
                    engineType = EngineType.valueOf(input);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.printf("Invalid input for engine type. Input must be one from the list above. Try again.\n");
                }
            } while (true);


            int engineSize;

            do {
                try {
                    System.out.printf("Enter engine size of vehicle %s: ", i+1);
                    engineSize = scan.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Input must be numeric.");
                    scan.next();
                }
            } while (true);



            int horsePower = 0;
            do {
                System.out.printf("Enter the power of the vehicle in HP's %s: ", i+1);
                try {
                    horsePower = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.printf("Invalid input. Input must be numeric %s\n", i+1);
                    scan.next();
                }
            } while (horsePower <= 0);



            int productionYear = 0;
            do {
                System.out.printf("Enter the production year of the vehicle %s: ", i+1);
                try {
                    productionYear = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.printf("Invalid input for production year on vehicle %s\n", i+1);
                    scan.next();
                }
            } while (productionYear <= 0);


            switch (vehicleType) {
                case CAR:
                    System.out.printf("Enter the number of doors for vehicle/car %s: ", i+1);
                    int numberOfDoors = scan.nextInt();
                    Car car = new Car(brand, engineSize, horsePower, engineType, productionYear, numberOfDoors);
                    vehicles.add(car);
                    break;
                case MOTORCYCLE:
                    Motorcycle motorcycle = new Motorcycle(brand, engineSize, horsePower, engineType, productionYear);
                    vehicles.add(motorcycle);
                    break;
                case TRUCK:
                    System.out.printf("Enter the number of additional trailers  of Truck (vehicle) %s: ", i+1);
                    int additionalTrailers = scan.nextInt();
                    Truck truck = new Truck(brand, engineSize, horsePower, engineType, productionYear, additionalTrailers);
                    vehicles.add(truck);
                    break;
                default:
                    System.out.printf("Wrong vehicle type: %s", vehicleType);

                    scan.close();

            }

            System.out.println("--------------------------------\n");
        }
        System.out.println("Sum for all vehicles:\n");
        for(int i = 0; i < vehicles.size(); i++) {
            System.out.printf("VEHICLE %s\n", i+1);
            System.out.println("--------------------------------\n");
            System.out.println(vehicles.get(i).toString());
            System.out.println("--------------------------------\n");
        }
        double sumOfRegistrationPrice = 0;

        for(Vehicle vehicle : vehicles) {
            sumOfRegistrationPrice += vehicle.calculateRegistrationCost();
        }

        System.out.printf("Total cash for vehicle %s vehicles is: " + sumOfRegistrationPrice, vehicles.size());

    }
}
