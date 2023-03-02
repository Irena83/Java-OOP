package Cake;

    class Sweets extends ProductMix {
        int sugarPercentage;

        public Sweets(String productName, double pricePerUnit, String unitOfMeasurement, String productionCountry, int amount, int sugarPercentage) {
            super(productName, pricePerUnit, unitOfMeasurement, productionCountry, amount);
            this.sugarPercentage = sugarPercentage;
        }
        public void calculateSugarAmount() {
            double sugarAmount = amount * (sugarPercentage / 100.0);
            System.out.println("Sugar Amount: " + sugarAmount);
        }
    }

