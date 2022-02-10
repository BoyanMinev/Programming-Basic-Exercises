package Lecture_01_StacksAndQueues.Exercises;

import java.util.*;

public class P05Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robotData = scanner.nextLine().split(";");
        LinkedHashMap<String, Integer> robots = getRobotsMap(robotData);
        LinkedHashMap<String, Integer> robotsWorking = getRobotsWorkingMap(robotData);

        String startTime = scanner.nextLine();
        int startTimeInSec = getTimeInSec(startTime);

        String inputItems = scanner.nextLine();
        ArrayDeque<String> queueOfItems = new ArrayDeque<>();
        while (!inputItems.equals("End")) {
            queueOfItems.offer(inputItems);

            inputItems = scanner.nextLine();
        }

        while (!queueOfItems.isEmpty()) {

            String currentItem = queueOfItems.poll();
            boolean isFoundFreeRobot = false;

            startTimeInSec ++;
            decreaseWorkingTimeRobots(robotsWorking);
            for (Map.Entry<String, Integer> robot : robotsWorking.entrySet()) {



                          if (robot.getValue() == 0) {
                              isFoundFreeRobot = true;
                              String robotWorkInTimeFormat = getTimeFormat(startTimeInSec);
                              System.out.println(robot.getKey() + " - " + currentItem + " " + robotWorkInTimeFormat);
                              robotsWorking.put(robot.getKey(), robots.get(robot.getKey()));
                              break;

                          }
                      }


                if (!isFoundFreeRobot) {
                    queueOfItems.offer(currentItem);
                }


        }


    }

    private static LinkedHashMap<String, Integer> getRobotsWorkingMap(String[] robotData) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String robotsData : robotData) {
            String robotName = robotsData.split("-")[0];

            map.put(robotName, 0);
        }
        return map;

    }

    private static LinkedHashMap<String, Integer> getRobotsMap(String[] robotData) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String robotsData : robotData) {
            String robotName = robotsData.split("-")[0];
            int timeProcessingItem = Integer.parseInt(robotsData.split("-")[1]);
            map.put(robotName, timeProcessingItem);
        }
        return map;



    }

    private static String getTimeFormat(int startTimeInSec) {
        int currentHours = startTimeInSec / 3600;
        if (currentHours == 24) {
            currentHours = 0;
        } else if (currentHours > 24) {
            currentHours = currentHours % 24;
        }
        int currentMinutes = startTimeInSec % 3600 / 60;
        int currentSec = startTimeInSec % 3600 % 60;

        return  String.format("[%02d:%02d:%02d]", currentHours, currentMinutes, currentSec);
    }

    private static int getTimeInSec(String startTime) {
        int hours = Integer.parseInt(startTime.split(":")[0]);
        int minutes = Integer.parseInt(startTime.split(":")[1]);
        int seconds = Integer.parseInt(startTime.split(":")[2]);
        return  (hours * 3600) + (minutes * 60) + seconds;

    }

    private static void decreaseWorkingTimeRobots(LinkedHashMap<String, Integer> robots) {
        for (Map.Entry<String, Integer> robot: robots.entrySet()) {
            if (robot.getValue() != 0){
                robot.setValue(robot.getValue() - 1);
            }
        }
    }
}


