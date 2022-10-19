package Lecture_05_FunctionalProgramming.Lab;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVAT = price -> price * 1.2;

        System.out.println("Prices with VAT:");

        Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).forEach(digit-> System.out.format("%.2f%n", addVAT.apply(digit)));
    }
}
