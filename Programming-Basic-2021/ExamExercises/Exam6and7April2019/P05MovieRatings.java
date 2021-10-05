package ExamExercises.Exam6and7April2019;


import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sumRatingFilms = 0.0;
        double highestRating = Double.NEGATIVE_INFINITY;
        double lowestRating = Double.POSITIVE_INFINITY;
        String nameHighRating = "";
        String nameLowRating = "";

        for (int i = 0; i < n; i++) {

            String nameOfFilm = scanner.nextLine();

            double ratingFilm = Double.parseDouble(scanner.nextLine());
            sumRatingFilms += ratingFilm;

            if (ratingFilm > highestRating) {
                highestRating = ratingFilm;
                nameHighRating = nameOfFilm;
            }
            if (ratingFilm < lowestRating) {
                lowestRating = ratingFilm;
                nameLowRating = nameOfFilm;

            }
        }
        double averageRatingFilms = sumRatingFilms / n;
        System.out.printf("%s is with highest rating: %.1f\n" +
                "%s is with lowest rating: %.1f\n" +
                "Average rating: %.1f", nameHighRating, highestRating, nameLowRating, lowestRating, averageRatingFilms);
    }
}
