package PracticalTask;
public class Vehicle {

    private String brand;
    private int engineSize;
    private int horsePowers;
    private EngineType engineType;
    private int productionYear;
    private double registrationCost;

    public Vehicle(String brand, int engineSize, int horsePowers, EngineType engineType, int productionYear) {
        this.brand = brand;
        this.engineSize = engineSize;
        this.horsePowers = horsePowers;
        this.engineType = engineType;
        this.productionYear = productionYear;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
    public int getHorsePowers() {
        return horsePowers;
    }
    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }
    public EngineType getEngineType() {
        return engineType;
    }
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public double calculateRegistrationCost(){
        return registrationCost;
    }
    @Override
    public String toString() {
        return "------Vehicle------" + "\n" +
                "Brand: " + brand + "\n" +
                "Engine Size: " + engineSize + " cc\n" +
                "Horse Powers: " + horsePowers + " hp\n" +
                "Engine Type: " + engineType + "\n" +
                "Production Year: " + productionYear + "\n" +
                "Amount for registration: " + calculateRegistrationCost() + "\n";
    }
}



