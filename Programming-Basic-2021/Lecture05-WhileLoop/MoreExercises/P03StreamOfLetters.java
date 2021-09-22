package L05WhileLoop.MoreExercises;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int secretCommand = 0;
        boolean isFound = false;
        StringBuilder word = new StringBuilder();
        int countN = 0;
        int countO = 0;
        int countC = 0;
        while (!input.equals("End")) {

            char symbol = input.charAt(0);

            if ((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122)) {

                if (symbol == 110 || symbol == 111 || symbol == 99) {
                    switch (symbol) {

                        case 'n':
                            countN += symbol;
                            if (countN == 110) {
                                secretCommand += countN;
                                input = scanner.nextLine();
                                if (secretCommand == 320) {

                                    System.out.printf("%s" + " ", word);
                                    word.delete(0, word.length());
                                    secretCommand = 0;
                                    countN = 0;
                                    countO = 0;
                                    countC = 0;
                                }
                                continue;
                            } else {
                                word.append(symbol);
                            }
                            break;
                        case 'o':
                            countO += symbol;
                            if (countO == 111) {
                                secretCommand += countO;
                                input = scanner.nextLine();
                                if (secretCommand == 320) {

                                    System.out.printf("%s" + " ", word);
                                    word.delete(0, word.length());
                                    secretCommand = 0;
                                    countN = 0;
                                    countO = 0;
                                    countC = 0;
                                }
                                continue;
                            } else {
                                word.append(symbol);
                            }
                            break;
                        case 'c':
                            countC += symbol;

                            if (countC == 99) {
                                secretCommand += countC;
                                input = scanner.nextLine();
                                if (secretCommand == 320) {

                                    System.out.printf("%s" + " ", word);
                                    word.delete(0, word.length());
                                    secretCommand = 0;
                                    countN = 0;
                                    countO = 0;
                                    countC = 0;
                                }
                                continue;
                            } else {
                                word.append(symbol);
                            }
                            break;
                    }
                } else {


                    word.append(symbol);

                }


            } else {
                input = scanner.nextLine();
                continue;
            }


            input = scanner.nextLine();
        }
    }
}
