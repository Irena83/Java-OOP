package PracticalTask;

import java.time.LocalDate;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, int engineSize, int horsePowers, EngineType engineType, int productionYear) {
        super(brand, engineSize, horsePowers, engineType, productionYear);
    }
    @Override
    public double calculateRegistrationCost() {
        int registrationPrice = 0;
        int currentYear = LocalDate.now().getYear();
        int motorcycleAge = currentYear - getProductionYear();

        if (getEngineSize() < 50 && motorcycleAge < 1) {
            registrationPrice = 5000;
        } else if (getEngineSize() < 50 && motorcycleAge > 1) {
            registrationPrice = 1000;
        }
            else if (getEngineSize() >= 50) {
                registrationPrice = 5000;
            } else {
                registrationPrice = 1000;
            }
            return registrationPrice;
        }

        @Override
        public String toString () {
            return "Motorcycle : " + getBrand() + "\n" +
                    "Engine Size : " + getEngineSize() + " cc\n" +
                    "Horse Powers : " + getHorsePowers() + " hp\n" +
                    "Engine Type : " + getEngineType() + "\n" +
                    "Production Year : " + getProductionYear() + "\n" +
                    "REGISTRATION AMOUNT : " + calculateRegistrationCost() + "\n";
        }

}





