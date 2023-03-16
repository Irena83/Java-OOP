package PracticalTask;

import java.time.LocalDate;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, int engineSize, int horsePowers, EngineType engineType, int productionYear) {
        super(brand, engineSize, horsePowers, engineType, productionYear);
    }
    @Override
    public double calculateRegistrationCost() {
        int registrationPrice = 0;

        if (getEngineSize() < 50){
            int currentYear = LocalDate.now().getYear();
            int motorcycleAge = currentYear - getProductionYear();
            if (motorcycleAge > 1){
                registrationPrice = 2000;
            }
        } else {
            registrationPrice = 3000;
        }
        return registrationPrice;
    }
    @Override
    public String toString() {
        return "Motorcycle : " + getBrand() + "\n" +
                "Engine Size : " + getEngineSize() + " cc\n" +
                "Horse Powers : " + getHorsePowers() + " hp\n" +
                "Engine Type : " + getEngineType() + "\n" +
                "Production Year : " + getProductionYear() + "\n" +
                "REGISTRATION AMOUNT : " + calculateRegistrationCost() + "\n";
    }


}




