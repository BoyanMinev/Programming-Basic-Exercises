package ExamExercises.Exam18And19July2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());

        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = 0;
        int start3 = 0;
        int end3 = 0;
        int start4 = 0;
        int end4 = 0;

        start1 = startInterval / 1000;
        start2 = (startInterval % 1000) / 100;
        start3 = (startInterval % 100) / 10;
        start4 = startInterval % 10;

        end1 = endInterval / 1000;
        end2 = (endInterval % 1000) / 100;
        end3 = (endInterval % 100) / 10;
        end4 = endInterval % 10;


        for (int i = start1; i <= end1; i++) {

            if (i % 2 != 0) {



                for (int j = start2; j <= end2; j++) {
                    if (j % 2 != 0) {




                        for (int k = start3; k <= end3; k++) {

                            if (k % 2 != 0) {



                                for (int l = start4; l <= end4; l++) {
                                    if (l % 2 != 0) {

                                        System.out.printf("%d%d%d%d ",i, j, k, l);


                                    }
                                }
                            }
                        }
                    }
                }

            }


        }
    }
}
