package Lecture_04_StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";


        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("ExtractIntegers.txt");

        PrintStream out = new PrintStream(outputStream);

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()){

            if(scanner.hasNextInt()){
               out.println(scanner.nextInt());
            }
            scanner.next();

        }

    }
}
