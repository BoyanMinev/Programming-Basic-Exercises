package Lecture_04_StreamsFilesAndDirectories.Lab;


import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class ListFiles {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("C:\\Users\\minev\\OneDrive\\Desktop\\SoftUni\\Advanced - september\\Lecture_04_Streams-Files-And-Directories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File file = path.toFile();

        File [] files = file.listFiles();


        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter("output-file.txt"));


        for (File file1: files) {
            if (!file1.isDirectory()) {
                Long bytes = Files.size(file1.toPath());
                String output = String.format("%s: [%d]", file1.getName(), bytes);

                bufferedWriter.write(output + System.lineSeparator());

                bufferedWriter.flush();
            }
        }
        bufferedWriter.close();

    }
}

