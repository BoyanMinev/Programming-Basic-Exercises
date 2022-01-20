package L_08_TextProcessing.MoreExercises;

import java.util.Scanner;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\|");
        StringBuilder output = new StringBuilder();
        for (String morseWord : data) {
            String[] word = morseWord.split(" ");
            for (String morseLetter : word) {

                switch (morseLetter) {
                    case ".-":
                        output.append("A");
                        break;
                    case "-...":
                        output.append("B");
                        break;
                    case "-.-.":
                        output.append("C");
                        break;
                    case "-..":
                        output.append("D");
                        break;
                    case ".":
                        output.append("E");
                        break;
                    case "..-.":
                        output.append("F");
                        break;
                    case "--.":
                        output.append("G");
                        break;
                    case "....":
                        output.append("H");
                        break;
                    case "..":
                        output.append("I");
                        break;
                    case ".---":
                        output.append("J");
                        break;
                    case "-.-":
                        output.append("K");
                        break;
                    case ".-..":
                        output.append("L");
                        break;
                    case "--":
                        output.append("M");
                        break;
                    case "-.":
                        output.append("N");
                        break;
                    case "---":
                        output.append("O");
                        break;
                    case ".--.":
                        output.append("P");
                        break;
                    case "--.-":
                        output.append("Q");
                        break;
                    case ".-.":
                        output.append("R");
                        break;
                    case "...":
                        output.append("S");
                        break;
                    case "-":
                        output.append("T");
                        break;
                    case "..-":
                        output.append("U");
                        break;
                    case "...-":
                        output.append("V");
                        break;
                    case ".--":
                        output.append("W");
                        break;
                    case "-..-":
                        output.append("X");
                        break;
                    case "-.--":
                        output.append("Y");
                        break;
                    case "--..":
                        output.append("Z");
                        break;
                }


            }
            output.append(" ");


        }
        System.out.println(output);
    }

}
