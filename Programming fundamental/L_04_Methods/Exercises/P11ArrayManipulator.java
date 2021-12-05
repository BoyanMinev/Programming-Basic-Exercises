package L_04_Methods.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("exchange")) {
                exchangeCommand(inputArray, input, command);
            } else if (command[0].equals("max")) {
                if (command[1].equals("even")) {
                    maxEvenCommand(inputArray);
                } else {
                    maxOddCommand(inputArray);
                }
            }else if (command[0].equals("min")){
                if (command[1].equals("even")) {
                    minEvenCommand(inputArray);
                } else {
                    minOddCommand(inputArray);
                }
            }else if (command[0].equals("first")){
                if (command[2].equals("even")){
                    firstEvenDigits(inputArray, command);
                }else if (command[2].equals("odd")){
                    firstOddDigits(inputArray, command);
                }
            }else if (command[0].equals("last")){
                if (command[2].equals("even")){
                    lastEvenDigits(inputArray, command);
                }else if (command[2].equals("odd")){
                    lastOddDigits(inputArray, command);
                }
            }

            input = scanner.nextLine();
        }
    }

    private static void lastOddDigits(int[] inputArray, String[] command) {
        String sample = "";

        int index = Integer.parseInt(command[1]);
        if (index > inputArray.length){
            System.out.println("Invalid count");
        }else {
            boolean isHaveEvenDigit = false;
            int[] firstEvenDigits = new int[index];
            for (int i = inputArray.length - 1; i >= 0; i--){
                if (inputArray[i] % 2 != 0) {

                    sample += inputArray[i];
                    if (sample.length() == index + (index - 1)){
                        break;
                    }else {
                        sample = sample + " ";
                    }

                    isHaveEvenDigit = true;
                }
            }
            String[] temp = sample.split(" ");
            String [] reverseTemp = new String[temp.length];
            for (int i = 0; i < temp.length; i++) {
                reverseTemp[temp.length - i - 1] = temp[i];
            }
            if (isHaveEvenDigit) {
                for (int i = 0; i < index; i++) {
                    firstEvenDigits[i] = Integer.parseInt(reverseTemp[i]);
                }
                System.out.print("[");
                for (int output :
                        firstEvenDigits) {
                    System.out.print(output);
                    if (output == firstEvenDigits[index - 1]){
                        System.out.print("]");
                        System.out.println();
                    }else{
                        System.out.print(", ");
                    }

                }
            }else {
                System.out.println("[]");
            }
        }
    }



    private static void lastEvenDigits(int[] inputArray, String[] command) {
        String sample = "";

        int index = Integer.parseInt(command[1]);
        if (index > inputArray.length){
            System.out.println("Invalid count");
        }else {
            boolean isHaveEvenDigit = false;
            int[] firstEvenDigits = new int[index];
            for (int i = inputArray.length - 1; i >= 0; i--){
                if (inputArray[i] % 2 == 0) {

                    sample += inputArray[i];
                    if (sample.length() == index + (index - 1)){
                        break;
                    }else {
                        sample = sample + " ";
                    }

                    isHaveEvenDigit = true;
                }
            }
            String[] temp = sample.split(" ");
            String [] reverseTemp = new String[temp.length];
            for (int i = 0; i < temp.length; i++) {
                reverseTemp[temp.length - i - 1] = temp[i];
            }
            if (isHaveEvenDigit) {
                for (int i = 0; i < index; i++) {
                    firstEvenDigits[i] = Integer.parseInt(reverseTemp[i]);
                }
                System.out.print("[");
                for (int output :
                        firstEvenDigits) {
                    System.out.print(output);
                    if (output == firstEvenDigits[index - 1]){
                        System.out.print("]");
                        System.out.println();
                    }else{
                        System.out.print(", ");
                    }

                }
            }else {
                System.out.println("[]");
            }
        }
    }


    private static void firstOddDigits(int[] inputArray, String[] command) {
        String sample = "";

        int index = Integer.parseInt(command[1]);
        if (index > inputArray.length){
            System.out.println("Invalid count");
        }else {
            boolean isHaveOddDigit = false;
            int[] firstOddDigits = new int[index];
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % 2 != 0) {

                    sample += inputArray[i];
                    if (sample.length() == index){

                    }else {
                        sample = sample + " ";
                    }

                    isHaveOddDigit = true;
                }
            }
            String[] temp = sample.split(" ");
            if (isHaveOddDigit) {
                for (int i = 0; i < temp.length; i++) {
                    firstOddDigits[i] = Integer.parseInt(temp[i]);
                }
                System.out.print("[");
                for (int output :
                        firstOddDigits) {
                    System.out.print(output);
                    if (output == firstOddDigits[index - 1]){
                        System.out.print("]");
                        System.out.println();
                    }else{
                        System.out.print(", ");
                    }

                }
            }else {
                System.out.println("[]");
            }
        }
    }



    private static void firstEvenDigits(int[] inputArray, String[] command) {
        String sample = "";

        int index = Integer.parseInt(command[1]);
        if (index > inputArray.length){
            System.out.println("Invalid count");
        }else {
            boolean isHaveEvenDigit = false;
            int[] firstEvenDigits = new int[index];
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % 2 == 0) {

                    sample += inputArray[i];
                    if (sample.length() == index){

                    }else {
                        sample = sample + " ";
                    }

                    isHaveEvenDigit = true;
                }
            }
            String[] temp = sample.split(" ");
            if (isHaveEvenDigit) {
                for (int i = 0; i < index; i++) {
                    firstEvenDigits[i] = Integer.parseInt(temp[i]);
                }
                System.out.print("[");
                for (int output :
                        firstEvenDigits) {
                    System.out.print(output);
                    if (output == firstEvenDigits[index - 1]){
                        System.out.print("]");
                        System.out.println();
                    }else{
                        System.out.print(", ");
                    }

                }
            }else {
                System.out.println("[]");
            }
        }
    }

    private static void minOddCommand(int[] inputArray) {
        int minOddDigit = Integer.MAX_VALUE;
        int indexMinOddDigit = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0){
                if (inputArray[i] < minOddDigit){
                    minOddDigit = inputArray[i];
                    indexMinOddDigit = i;
                }else if(inputArray[i] == minOddDigit){
                    indexMinOddDigit = i;
                }
            }
        }
        if (indexMinOddDigit == -1){
            System.out.println("No matches");
        }else {
            System.out.println(indexMinOddDigit);
        }
    }

    private static void minEvenCommand(int[] inputArray) {
        int minEvenDigit = Integer.MAX_VALUE;
        int indexMinEvenDigit = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0){
                if (inputArray[i] < minEvenDigit){
                    minEvenDigit = inputArray[i];
                    indexMinEvenDigit = i;
                }else if (inputArray[i] == minEvenDigit){
                    indexMinEvenDigit = i;
                }
            }
        }
        if (indexMinEvenDigit == -1){
            System.out.println("No matches");
        }else{
            System.out.println(indexMinEvenDigit);
        }
    }

    private static void maxOddCommand(int[] inputArray) {
        int maxOddDigit = Integer.MIN_VALUE;
        int indexMaxOddDigit = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0){
                if (inputArray[i] > maxOddDigit){
                    maxOddDigit = inputArray[i];
                    indexMaxOddDigit = i;
                }else if (inputArray[i] == maxOddDigit){
                    indexMaxOddDigit = i;
                }
            }
        }
        if (indexMaxOddDigit == -1){
            System.out.println("No matches");
        }else {
            System.out.println(indexMaxOddDigit);
        }
    }

    private static void maxEvenCommand(int[] inputArray) {
        int maxEvenDigit = Integer.MIN_VALUE;
        int indexMaxEvenDigit = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                if (inputArray[i] > maxEvenDigit) {
                    maxEvenDigit = inputArray[i];
                    indexMaxEvenDigit = i;
                } else if (inputArray[i] == maxEvenDigit) {
                    indexMaxEvenDigit = i;
                }
            }
        }
        if (indexMaxEvenDigit == -1){
            System.out.println("No matches");
        }else{
            System.out.println(indexMaxEvenDigit);
        }

    }

    private static void exchangeCommand(int[] inputArray, String input, String[] command) {


        int[] changeArray = new int[inputArray.length];
        int index = Integer.parseInt(command[1]);
        int[] arrayChangeLeft = new int[index + 1];
        int[] arrayChangeRight = new int[inputArray.length - index - 1];
        if (index > inputArray.length - 1 || index < 0) {
            System.out.println("Invalid index");
        } else {
            for (int i = 0; i < index + 1; i++) {
                arrayChangeLeft[i] = inputArray[i];
            }
            for (int i = index + 1; i < inputArray.length; i++) {
                arrayChangeRight[i - index - 1] = inputArray[i];
            }
            for (int i = 0; i < inputArray.length - index - 1; i++) {
                changeArray[i] = arrayChangeRight[i];
            }
            for (int i = inputArray.length - index - 1; i < inputArray.length; i++) {
                changeArray[i] = arrayChangeLeft[i - (inputArray.length - index - 1)];
            }
            for (int changeNumber :
                    changeArray) {
                System.out.print(changeNumber + " ");
            }
            System.out.println();

        }


    }
}
