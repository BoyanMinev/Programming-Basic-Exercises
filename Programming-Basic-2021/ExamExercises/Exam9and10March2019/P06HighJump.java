package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wishHeight = Integer.parseInt(scanner.nextLine());

        int input = Integer.parseInt(scanner.nextLine());

        int currentHeight = 0;
        int countJumps = 0;

        boolean isDone = false;
        label:
        for (int i = 0; i < 3; i++) {
            countJumps++;
            currentHeight = (wishHeight - 30);
            if (input > (wishHeight - 30)) {
                for (int j = 0; j < 3; j++) {
                    input = Integer.parseInt(scanner.nextLine());
                    countJumps++;
                    currentHeight = (wishHeight - 25);
                    if (input > (wishHeight - 25)) {

                        for (int k = 0; k < 3; k++) {
                            input = Integer.parseInt(scanner.nextLine());
                            countJumps++;
                            currentHeight = (wishHeight - 20);
                            if (input > (wishHeight - 20)) {

                                for (int l = 0; l < 3; l++) {
                                    input = Integer.parseInt(scanner.nextLine());
                                    countJumps++;
                                    currentHeight = (wishHeight - 15);

                                    if (input > (wishHeight - 15)) {

                                        for (int m = 0; m < 3; m++) {
                                            input = Integer.parseInt(scanner.nextLine());
                                            countJumps++;
                                            currentHeight = (wishHeight - 10);

                                            if (input > (wishHeight - 10)) {

                                                for (int n = 0; n < 3; n++) {
                                                    input = Integer.parseInt(scanner.nextLine());
                                                    countJumps++;
                                                    currentHeight = (wishHeight - 5);
                                                    if (input > (wishHeight - 5)) {

                                                        for (int o = 0; o < 3; o++) {
                                                            input = Integer.parseInt(scanner.nextLine());
                                                            countJumps++;
                                                            currentHeight = wishHeight;
                                                            if (input > wishHeight) {
                                                                isDone = true;
                                                                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeight, countJumps);

                                                                break label;

                                                            }
                                                            if (o == 2){
                                                                break label;
                                                            }

                                                        }
                                                    }
                                                    if (n == 2){
                                                        break label;
                                                    }

                                                }

                                            }
                                            if (m == 2){
                                                break label;
                                            }

                                        }
                                    }

                                    if (l == 2){
                                        break label;
                                    }
                                }


                            }



                            if (k == 2){
                                break label;
                            }
                        }


                    }

                    if (j == 2){
                        break label;
                    }
                }


            }
            input = Integer.parseInt(scanner.nextLine());
            if (i == 2){
                break label;
            }
        }
        if (!isDone) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, countJumps);
        }


    }


}
