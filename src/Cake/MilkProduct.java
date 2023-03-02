package Cake;

    class MilkProduct extends ProductMix {
        int milkFatPercentage;

        public MilkProduct(String productName, double pricePerUnit, String unitOfMeasurement, String productionCountry, int amount, int milkFatPercentage) {
            super(productName, pricePerUnit, unitOfMeasurement, productionCountry, amount);
            this.milkFatPercentage = milkFatPercentage;
        }
        public void calculateMilkFatAmount() {
            double milkFatAmount = amount * (milkFatPercentage / 100.0);
            System.out.println("Milk Fat Amount: " + milkFatAmount);
        }
    }


