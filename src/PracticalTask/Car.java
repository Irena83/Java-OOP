package PracticalTask;

import java.time.LocalDate;

public class Car extends Vehicle{
    private int numDoors;
    public Car(String brand, int engineSize, int horsePowers, EngineType engineType, int productionYear, int numDoors) {
        super(brand, engineSize, horsePowers, engineType, productionYear);
        this.numDoors = numDoors;
    }
    public int getNumberOfDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    @Override
    public double calculateRegistrationCost() {
        int registrationPrice = 0;
        EngineType engineType = getEngineType();

        switch (engineType){
            case ELECTRIC:
                registrationPrice = 5000;
                break;
            case DIESEL:
            case GASOLINE:
                registrationPrice = 10000;
                break;
            default:
                System.out.println("Wrong engine type.");
        }
        if (getEngineSize() > 2000){
            registrationPrice += registrationPrice * 0.4;
        }
        int currentYear = LocalDate.now().getYear();
        int carAge = currentYear - getProductionYear();

        if (carAge > 5){
            for (int i = 0; i < carAge - 5; i++){
                registrationPrice += registrationPrice * 0.05;
            }
        }
        return registrationPrice;
    }
    @Override
    public String toString() {
        return "Car: " + getBrand() + "\n" +
                "Engine Size : " + getEngineSize() + " cc\n" +
                "Horse Powers: " + getHorsePowers() + " hp\n" +
                "Engine Type : " + getEngineType() + "\n" +
                "Production Year : " + getProductionYear() + "\n" +
                "Number of Doors: " + getNumberOfDoors() + "\n" +
                "REGISTRATION AMOUNT: " + calculateRegistrationCost() + "\n";
    }
}

