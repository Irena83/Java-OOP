package PracticalTask;

public class Truck extends Vehicle {
    private int additionalTrailers = 0;
    public Truck(String brand, int engineSize, int horsePowers, EngineType engineType, int productionYear, int additionalTrailers) {
        super(brand, engineSize, horsePowers, engineType, productionYear);
        this.additionalTrailers = additionalTrailers;
    }
    public int getAdditionalTrailers() {
        return additionalTrailers;
    }
    public void setAdditionalTrailers(int additionalTrailers) {
        this.additionalTrailers = additionalTrailers;
    }
    @Override
    public double calculateRegistrationCost() {
        int registrationPrice = 15000;
        for (int i = 0; i < getAdditionalTrailers(); i++) {
            registrationPrice += 17000;
        }
        return registrationPrice;
    }
    @Override
    public String toString() {
        return "Truck: " + getBrand() + "\n" +
                "Engine Size: " + getEngineSize() + "cc\n" +
                "Horse Powers: " + getHorsePowers() + "hp\n" +
                "Engine Type: " + getEngineType() + "\n" +
                "Production Year: " + getProductionYear() + "\n" +
                "Additional Trailers: " + getAdditionalTrailers() + "\n" +
                "REGISTRATION AMOUNT: " + calculateRegistrationCost() + "\n";
    }
}

