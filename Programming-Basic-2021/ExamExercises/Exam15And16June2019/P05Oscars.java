    package ExamExercises.Exam15And16June2019;

    import java.util.Scanner;

    public class P05Oscars {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String nameActor = scanner.nextLine();

            double pointsAcademy = Double.parseDouble(scanner.nextLine());

            int n = Integer.parseInt(scanner.nextLine());

            boolean isNomination = false;
            double totalPointActor = pointsAcademy;



            for (int i = 0; i < n; i++) {

                String judgeName = scanner.nextLine();

                double pointsJudge = Double.parseDouble(scanner.nextLine());

                totalPointActor += ((judgeName.length() * pointsJudge) / 2);


                if (totalPointActor >= 1250.5){
                    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, totalPointActor);
                    isNomination = true;
                    break;
                }
            }
            if (!isNomination){
                double diff = 1250.5 - totalPointActor;
                System.out.printf("Sorry, %s you need %.1f more!", nameActor, diff);
            }

        }
    }
