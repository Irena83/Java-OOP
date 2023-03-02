package Cake;

public class Main {

    public static void main(String[] args) {
        ProductMix productMix1 = new ProductMix("Pear", 1.5, "kg", "Serbia", 7);
        productMix1.printAllInformation();
        productMix1.calculatePrice();

        MilkProduct milkProduct1 = new MilkProduct("Domestic Yogurt", 3.5, "L", "Hungary", 2, 4);
        milkProduct1.printAllInformation();
        milkProduct1.calculatePrice();
        milkProduct1.calculateMilkFatAmount();

        Sweets sweets1 = new Sweets("Rise Chocolate", 2.0, "G", "Malta", 8, 40);
        sweets1.printAllInformation();
        sweets1.calculatePrice();
        sweets1.calculateSugarAmount();
    }
}

