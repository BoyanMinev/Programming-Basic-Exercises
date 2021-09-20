package L05WhileLoop.Exercises;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String input = scanner.nextLine();
        boolean isFound = false;

        int bookCounter = 0;

        //докато input е различен от "No More Books"
        while(!input.equals("No More Books")){
            //Проверка дали книгата е намерена
            if (input.equals(searchedBook)){
                isFound = true;
                break;
            }
            bookCounter ++;
            //Прочитаме от конзолата следващата книга
            input = scanner.nextLine();
        }
        String output = "";
        if (isFound){
            output = String.format("You checked %d books and found it.", bookCounter);

        }else{
            output = String.format("The book you search is not here!\n" +
                    "You checked %d books.", bookCounter);

        }
        System.out.println(output);


    }
}
