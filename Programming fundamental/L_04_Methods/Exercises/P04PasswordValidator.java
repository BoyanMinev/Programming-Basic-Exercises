package L_04_Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isLongEnough = isLongEnough(password);
        boolean isOnlyHaveLettersAndDigits = isOnlyHaveLettersAndDigits(password);
        boolean isHaveTwoDigits = isHaveTwoDigits(password);

        if (!isLongEnough){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isOnlyHaveLettersAndDigits){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isHaveTwoDigits){
            System.out.println("Password must have at least 2 digits");
        }
        if (isLongEnough && isHaveTwoDigits && isOnlyHaveLettersAndDigits){
            System.out.println("Password is valid");
        }

    }

    private static boolean isHaveTwoDigits(String password) {
        boolean isTRue = false;
        int counter = 0;
        for (int i = 0; i <password.length() ; i++) {
            char currentChar = password.charAt(i);
            if (currentChar >= 48 && currentChar <= 57){
                counter ++;
            }
        }
        if (counter >= 2){
            isTRue = true;
        }
        return isTRue;
    }

    private static boolean isOnlyHaveLettersAndDigits(String password) {

        boolean isTRue = false;
        for (int i = 0; i <password.length() ; i++) {
            char currentChar = password.charAt(i);
            if (currentChar >= 65 && currentChar <= 90 || currentChar >= 97 && currentChar <= 122 ||
                    currentChar >= 48 && currentChar <= 57){
                isTRue = true;
            }else {
                isTRue = false;
                break;
            }
        }
        return isTRue;
    }

    private static boolean isLongEnough(String password) {
        boolean isTRue = false;
        if (password.length() >= 6 && password.length() <= 10){
            isTRue = true;
        }
        return isTRue;
    }
}
