package Lecture_04_StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExampleBFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("C:\\Users\\minev\\advanced-september");


        File root = path.toFile();

        Deque<File> queue = new ArrayDeque<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            File file = queue.poll();
            System.out.println(file.getName());
            File[] files = file.listFiles();

            if (files != null){
                for (File f: files) {
                    if (f.isDirectory()){
                        queue.offer(f);
                    }else {
                        System.out.println(f.getName());
                    }
                }

            }

        }



    }
}
