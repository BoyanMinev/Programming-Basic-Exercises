package L_05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> scheduleLessons = Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        while(!input.equals("course start")){
            String[] command = input.split(":");
            if (command[0].equals("Add")){
               if (!isTheLessonExist(command[1], scheduleLessons)){
                   scheduleLessons.add(command[1]);
               }
            }else if(command[0].equals("Insert")){
                if (!isTheLessonExist(command[1], scheduleLessons)){
                    scheduleLessons.add(Integer.parseInt(command[2]), command[1]);
                }
            }else if (command[0].equals("Remove")){
                String addExercise = command[1] + "-Exercise";
                if (isTheLessonExist(command[1], scheduleLessons)){
                    scheduleLessons.remove(command[1]);
                }else if (isTheExerciseExist(scheduleLessons, addExercise)){
                    scheduleLessons.remove(addExercise);
                }
            }else if (command[0].equals("Swap")){

                if(isTheLessonExist(command[1], scheduleLessons) && isTheLessonExist(command[2], scheduleLessons)) {
                    String lesson1 = command[1];

                    String addExercise1 = command[1] + "-Exercise";
                    String addExercise2 = command[2] + "-Exercise";
                    int indexOfLessonSwap1 = scheduleLessons.indexOf(command[1]);
                    int indexOfLessonSwap2 = scheduleLessons.indexOf(command[2]);
                    ;
                    scheduleLessons.set(indexOfLessonSwap1, command[2]);
                    scheduleLessons.set(indexOfLessonSwap2, lesson1);
                    if(scheduleLessons.contains(addExercise1)){
                        scheduleLessons.remove(scheduleLessons.indexOf(addExercise1));
                        scheduleLessons.add(indexOfLessonSwap2 + 1, addExercise1);
                    }
                    if (scheduleLessons.contains(addExercise2)){
                        scheduleLessons.remove(scheduleLessons.indexOf(addExercise2));
                        scheduleLessons.add(indexOfLessonSwap1 + 1, addExercise2);
                    }
                }

            }else if (command[0].equals("Exercise")){
                String addExercise = command[1] + "-Exercise";
                if (isTheLessonExist(command[1], scheduleLessons) && !isTheExerciseExist(scheduleLessons, addExercise)){
                    int indexOfLesson = scheduleLessons.indexOf(command[1]);
                    scheduleLessons.add(indexOfLesson + 1, addExercise);
                }else if (!isTheLessonExist(command[1], scheduleLessons)){
                    scheduleLessons.add(command[1]);
                    scheduleLessons.add(addExercise);
                }
            }
            input = scanner.nextLine();


        }

        for (int i = 1; i <= scheduleLessons.size(); i++) {
            System.out.println(i + "." + scheduleLessons.get(i - 1));
        }
    }

    private static boolean isTheExerciseExist(List<String> scheduleLessons, String addExercise) {

        return scheduleLessons.contains(addExercise);


    }

    private static boolean isTheLessonExist(String lesson, List<String> scheduleLessons) {
       boolean isExist = false;
        for (int i = 0; i < scheduleLessons.size(); i++) {
            if (scheduleLessons.get(i).equals(lesson)){
                isExist = true;
            }
        }
        return isExist;
    }
}
