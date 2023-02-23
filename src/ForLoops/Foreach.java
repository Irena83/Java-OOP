package ForLoops;

//Create array of numbers (3, 54, 67, 11, 22, 106, 4)
//Print all numbers that are even (can be divided with 2)

public class Foreach {
    public static void main(String[] args) {
        int[] numbers = {3, 54, 67, 11, 22, 106, 4};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}



