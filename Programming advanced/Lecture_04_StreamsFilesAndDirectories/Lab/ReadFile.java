package Lecture_04_StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String path = "C:\\Users\\minev\\OneDrive\\Desktop\\SoftUni\\Advanced " +
                "- september\\Lecture_04_Streams-Files-And-Directories\\" +
                "Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";


        FileInputStream inputStream = new FileInputStream(path);


        int value = inputStream.read();


        while (value != -1) {
            System.out.print(Integer.toBinaryString(value) + " ");
            value = inputStream.read();
        }


    }
}


