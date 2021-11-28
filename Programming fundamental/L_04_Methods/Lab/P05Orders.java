package L_04_Methods.Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        priceOrder(product, quantity);

    }

    private static void priceOrder(String product, int quantity) {
        double price = 0;
        switch (product){
            case "coffee":
                price = 1.50 * quantity;
                break;
            case "water":
                price = 1.00 * quantity;
                break;
            case "coke":
                price = 1.40 * quantity;
                break;
            case "snacks":
                price = 2.00 * quantity;
                break;
        }
        System.out.printf("%.2f", price);

    }
}
