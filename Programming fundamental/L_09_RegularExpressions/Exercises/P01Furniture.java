package L_09_RegularExpressions.Exercises;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = ">>(?<product>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        List<String> products = new ArrayList<>();
        double totalSpendMoney = 0;
        while (!input.equals("Purchase")){

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double totalPriceForProduct = price * quantity;
                products.add(product);
                totalSpendMoney += totalPriceForProduct;

            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        products.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSpendMoney);
    }
}
