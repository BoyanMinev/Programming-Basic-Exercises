package L04ForLoop.MoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int patientsTreated = 0;
        int patientsNonTreated = 0;
        int numOfDoctors = 7;

        for (int i = 1; i <= period; i++) {
            int numPatients = Integer.parseInt(scanner.nextLine());


            if (i % 3 != 0) {
                if (numPatients < numOfDoctors) {
                    patientsTreated += numPatients;
                } else {
                    patientsTreated += numOfDoctors;
                    patientsNonTreated += (numPatients - numOfDoctors);
                }
            } else {
                if (patientsTreated < patientsNonTreated) {
                    numOfDoctors++;
                }
                if (numPatients < numOfDoctors) {
                    patientsTreated += numPatients;
                } else {
                    patientsTreated += numOfDoctors;
                    patientsNonTreated += (numPatients - numOfDoctors);
                }


            }

        }
        System.out.printf("Treated patients: %d.\n" +
                "Untreated patients: %d.", patientsTreated, patientsNonTreated);


    }
}

