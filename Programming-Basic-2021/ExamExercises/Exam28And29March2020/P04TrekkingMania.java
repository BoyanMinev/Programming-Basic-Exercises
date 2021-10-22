package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfGroups = Integer.parseInt(scanner.nextLine());

        int countMusala = 0;
        int countMonblan = 0;
        int countKilimandjaro = 0;
        int countK2 = 0;
        int countEverest = 0;
        int totalPeople = 0;

        for (int i = 1; i <= numOfGroups ; i++) {



            int numPeopleInGroup = Integer.parseInt(scanner.nextLine());

            totalPeople += numPeopleInGroup;


            if (numPeopleInGroup <= 5){
                countMusala+=numPeopleInGroup;
            }else if (numPeopleInGroup <= 12){
                countMonblan+= numPeopleInGroup;
            }else if (numPeopleInGroup <= 25){
                countKilimandjaro+= numPeopleInGroup;
            }else if (numPeopleInGroup <= 40){
                countK2 += numPeopleInGroup;
            }else {
                countEverest += numPeopleInGroup;
            }

        }
        double averageMusala = 1.0 * countMusala / totalPeople * 100;
        double averageMonblan = 1.0 * countMonblan / totalPeople * 100;
        double averageKilimanjaro = 1.0 * countKilimandjaro / totalPeople * 100;
        double averageK2 = 1.0 * countK2 / totalPeople * 100;
        double averageEverest = 1.0 * countEverest / totalPeople * 100;

        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%", averageMusala, averageMonblan, averageKilimanjaro, averageK2, averageEverest);
    }
}
