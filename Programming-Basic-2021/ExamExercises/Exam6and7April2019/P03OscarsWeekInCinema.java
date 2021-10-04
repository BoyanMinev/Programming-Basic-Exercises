package ExamExercises.Exam6and7April2019;

import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFilm = scanner.nextLine();

        String typeOfHall = scanner.nextLine();

        int numBought = Integer.parseInt(scanner.nextLine());

        double incomeForProjections = 0.0;


        if (typeOfHall.equalsIgnoreCase("normal")) {
            switch (nameFilm) {
                case "A Star Is Born":
                    incomeForProjections = 7.50 * numBought;
                    break;
                case "Bohemian Rhapsody":
                    incomeForProjections = 7.35 * numBought;
                    break;
                case "Green Book":
                    incomeForProjections = 8.15 * numBought;
                    break;
                case "The Favourite":
                    incomeForProjections = 8.75 * numBought;
                    break;
            }
        } else if (typeOfHall.equalsIgnoreCase("luxury")) {
            switch (nameFilm) {
                case "A Star Is Born":
                    incomeForProjections = 10.50 * numBought;
                    break;
                case "Bohemian Rhapsody":
                    incomeForProjections = 9.45 * numBought;
                    break;
                case "Green Book":
                    incomeForProjections = 10.25 * numBought;
                    break;
                case "The Favourite":
                    incomeForProjections = 11.55 * numBought;
                    break;
            }
        } else if (typeOfHall.equalsIgnoreCase("ultra luxury")) {
            switch (nameFilm) {
                case "A Star Is Born":
                    incomeForProjections = 13.50 * numBought;
                    break;
                case "Bohemian Rhapsody":
                    incomeForProjections = 12.75 * numBought;
                    break;
                case "Green Book":
                    incomeForProjections = 13.25 * numBought;
                    break;
                case "The Favourite":
                    incomeForProjections = 13.95 * numBought;
                    break;
            }
        }
        System.out.printf("%s -> %.2f lv.", nameFilm, incomeForProjections);
    }
}