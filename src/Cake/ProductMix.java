package Cake;

public class ProductMix {
        String productName;
        double pricePerUnit;
        String unitOfMeasurement;
        String productionCountry;
        int amount;

    public ProductMix(String productName, double pricePerUnit, String unitOfMeasurement, String productionCountry, int amount) {
            this.productName = productName;
            this.pricePerUnit = pricePerUnit;
            this.unitOfMeasurement = unitOfMeasurement;
            this.productionCountry = productionCountry;
            this.amount = amount;
        }
        public void printAllInformation() {
            System.out.println("Product Name: " + productName);
            System.out.println("Price Per Unit: " + pricePerUnit);
            System.out.println("Unit of Measurement: " + unitOfMeasurement);
            System.out.println("Production Country: " + productionCountry);
            System.out.println("Amount: " + amount);
        }

        public void calculatePrice() {
            double totalPrice = amount * pricePerUnit;
            System.out.println("Total Price: " + totalPrice);
        }
    }

