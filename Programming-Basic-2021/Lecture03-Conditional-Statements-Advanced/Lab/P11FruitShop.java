package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        //banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //2.50	    1.20	 0.85	   1.45	    2.70	   5.50	     3.85

        if (dayOfWeek.equalsIgnoreCase("monday")) {
            switch (fruit) {
                case "banana":
                    price = 2.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = 1.20 * quantity;System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = 0.85 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = 1.45 * quantity;System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = 2.70 * quantity;System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = 5.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = 3.85 * quantity;System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");

            }
        } else if (dayOfWeek.equalsIgnoreCase("tuesday")) {
            switch (fruit) {
                case "banana":
                    price = 2.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = 1.20 * quantity;System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = 0.85 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = 1.45 * quantity;System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = 2.70 * quantity;System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = 5.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = 3.85 * quantity;System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");

            }
        }else if (dayOfWeek.equalsIgnoreCase("wednesday")) {
            switch (fruit) {
                case "banana":
                    price = 2.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = 1.20 * quantity;System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = 0.85 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = 1.45 * quantity;System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = 2.70 * quantity;System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = 5.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = 3.85 * quantity;System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");
            }
        }else if (dayOfWeek.equalsIgnoreCase("thursday")) {
            switch (fruit) {
                case "banana":
                    price = 2.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = 1.20 * quantity;System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = 0.85 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = 1.45 * quantity;System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = 2.70 * quantity;System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = 5.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = 3.85 * quantity;System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");
            }
        }else if (dayOfWeek.equalsIgnoreCase("friday")) {
            switch (fruit) {
                case "banana":
                    price = 2.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = 1.20 * quantity;System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = 0.85 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = 1.45 * quantity;System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = 2.70 * quantity;System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = 5.50 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = 3.85 * quantity;System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");
            }
//banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//2.70	     1.25	0.90	   1.60	    3.00	  5.60	     4.20

        }else if (dayOfWeek.equalsIgnoreCase("saturday")) {
            switch (fruit) {
                case "banana":
                    price = 2.70 * quantity;System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = 1.25 * quantity;System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = 0.90 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = 1.60 * quantity;System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = 3.00 * quantity;System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = 5.60 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = 4.20 * quantity;System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");
            }
        }else if (dayOfWeek.equalsIgnoreCase("sunday")) {
            switch (fruit) {
                case "banana":
                    price = 2.70 * quantity;System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = 1.25 * quantity;System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = 0.90 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = 1.60 * quantity;System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = 3.00 * quantity;System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = 5.60 * quantity;System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = 4.20 * quantity;System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");

            }
        }else{
            System.out.println("error");
        }

    }
}