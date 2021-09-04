package L03ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String typeThicket = scanner.nextLine();
        int numOfPeopleInGroup = Integer.parseInt(scanner.nextLine());

        double priceForTransport = 0.0;
        double differenceMoney = 0.0;
        double priceForTickets = 0.0;
        if (numOfPeopleInGroup >= 1 && numOfPeopleInGroup <= 4){
            priceForTransport = budget * 0.75;
            if (typeThicket.equalsIgnoreCase("Vip")){
               priceForTickets = numOfPeopleInGroup * 499.99;
               if ((priceForTickets + priceForTransport) > budget){
                   differenceMoney = (priceForTickets + priceForTransport) - budget;
                   System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
               }
               else if ((priceForTickets + priceForTransport)  < budget){
                   differenceMoney = budget - (priceForTransport + priceForTickets);
                   System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
               }
            }
            else if (typeThicket.equalsIgnoreCase("Normal")){
                priceForTickets = numOfPeopleInGroup * 249.99;
                if ((priceForTickets + priceForTransport) > budget){
                    differenceMoney = (priceForTickets + priceForTransport) - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                }
                else if ((priceForTickets + priceForTransport)  < budget){
                    differenceMoney = budget - (priceForTransport + priceForTickets);
                    System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                }
            }
        }
        else if (numOfPeopleInGroup >= 5 && numOfPeopleInGroup <= 9){
            priceForTransport = budget * 0.6;
            if (typeThicket.equalsIgnoreCase("Vip")) {
                priceForTickets = numOfPeopleInGroup * 499.99;
                if ((priceForTickets + priceForTransport) > budget) {
                    differenceMoney = (priceForTickets + priceForTransport) - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                } else if ((priceForTickets + priceForTransport)  < budget) {
                    differenceMoney = budget - (priceForTransport + priceForTickets);
                    System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                }
            }else if (typeThicket.equalsIgnoreCase("Normal")){
                    priceForTickets = numOfPeopleInGroup * 249.99;
                    if ((priceForTickets + priceForTransport) > budget){
                        differenceMoney = (priceForTickets + priceForTransport) - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                    }
                    else if ((priceForTickets + priceForTransport)  < budget){
                        differenceMoney = budget - (priceForTransport + priceForTickets);
                        System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                    }
                }


        }
        else if (numOfPeopleInGroup >= 10 && numOfPeopleInGroup <= 24){
            priceForTransport = budget * 0.5;
            if (typeThicket.equalsIgnoreCase("Vip")) {
                priceForTickets = numOfPeopleInGroup * 499.99;
                if ((priceForTickets + priceForTransport) > budget) {
                    differenceMoney = (priceForTickets + priceForTransport) - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                } else if ((priceForTickets + priceForTransport)  < budget) {
                    differenceMoney = budget - (priceForTransport + priceForTickets);
                    System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                }
            }else if (typeThicket.equalsIgnoreCase("Normal")){
                priceForTickets = numOfPeopleInGroup * 249.99;
                if ((priceForTickets + priceForTransport) > budget){
                    differenceMoney = (priceForTickets + priceForTransport) - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                }
                else if ((priceForTickets + priceForTransport)  < budget){
                    differenceMoney = budget - (priceForTransport + priceForTickets);
                    System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                }
            }

        }
        else if (numOfPeopleInGroup >= 25 && numOfPeopleInGroup <= 49){
            priceForTransport = budget * 0.4;
            if (typeThicket.equalsIgnoreCase("Vip")) {
                priceForTickets = numOfPeopleInGroup * 499.99;
                if ((priceForTickets + priceForTransport) > budget) {
                    differenceMoney = (priceForTickets + priceForTransport) - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                } else if ((priceForTickets + priceForTransport)  < budget) {
                    differenceMoney = budget - (priceForTransport + priceForTickets);
                    System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                }
            }else if (typeThicket.equalsIgnoreCase("Normal")){
                priceForTickets = numOfPeopleInGroup * 249.99;
                if ((priceForTickets + priceForTransport) > budget){
                    differenceMoney = (priceForTickets + priceForTransport) - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                }
                else if ((priceForTickets + priceForTransport)  < budget){
                    differenceMoney = budget - (priceForTransport + priceForTickets);
                    System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                }
            }

        }
        else if (numOfPeopleInGroup >= 50){
            priceForTransport = budget * 0.25;
            if (typeThicket.equalsIgnoreCase("Vip")) {
                priceForTickets = numOfPeopleInGroup * 499.99;
                if ((priceForTickets + priceForTransport) > budget) {
                    differenceMoney = (priceForTickets + priceForTransport) - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                } else if ((priceForTickets + priceForTransport)  < budget) {
                    differenceMoney = budget - (priceForTransport + priceForTickets);
                    System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                }
            }else if (typeThicket.equalsIgnoreCase("Normal")){
                priceForTickets = numOfPeopleInGroup * 249.99;
                if ((priceForTickets + priceForTransport) > budget){
                    differenceMoney = (priceForTickets + priceForTransport) - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", differenceMoney);
                }
                else if ((priceForTickets + priceForTransport)  < budget){
                    differenceMoney = budget - (priceForTransport + priceForTickets);
                    System.out.printf("Yes! You have %.2f leva left.", differenceMoney);
                }
            }
        }
    }
}
