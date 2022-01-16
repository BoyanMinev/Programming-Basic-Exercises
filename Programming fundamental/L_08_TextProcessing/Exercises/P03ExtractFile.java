package L_08_TextProcessing.Exercises;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        String[] fileNameAndExtension = input[input.length - 1].split("\\.");
        String fileName = fileNameAndExtension[0];
        String extension = fileNameAndExtension[1];
        System.out.printf("File name: %s\n" +
                "File extension: %s\n", fileName, extension);
    }
}
