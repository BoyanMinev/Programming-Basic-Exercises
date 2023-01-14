package Lecture_07_Generics.Exercises.Generic_Box_Of_Integer;


import Lecture_07_Generics.Exercises.GenericBox.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();

        while (num != 0){
            Integer value = Integer.parseInt(scanner.nextLine());
            box.add(value);
            num--;
        }
        System.out.println(box);
    }
    }

