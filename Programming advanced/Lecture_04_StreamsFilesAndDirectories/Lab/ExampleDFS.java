package Lecture_04_StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExampleDFS {
    public static void main(String[] args) throws IOException {


        Path path = Paths.get("C:\\Users\\minev\\OneDrive\\Desktop\\SoftUni\\Advanced - september\\Lecture_04_Streams-Files-And-Directories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources");

        File root = path.toFile();



        dfs(root);
    }

    private static void dfs(File file) {

        System.out.println(file.getName());

        File[] files = file.listFiles();

        if (files != null){

            for (File f : files) {

                if (f.isDirectory()){
                    dfs(f);
                }else {
                    System.out.println(f.getName());
                }
            }
        }


    }
}
