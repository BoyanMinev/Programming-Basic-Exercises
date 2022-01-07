package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.*;
import java.util.stream.Collectors;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();
        Map<String, Double> studentGrades = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            List<Double> grades = new ArrayList<>();

            if(!students.containsKey(student)){
                grades.add(grade);
                students.put(student, grades);
            }else {

                students.get(student).add(grade);

            }




        }

        Map<String, Double> finalStudentGrades = studentGrades;
        students.entrySet().stream().forEach(e -> { double averageGrade = 0;
            for (int i = 0; i < e.getValue().size(); i++) {
                averageGrade = averageGrade + e.getValue().get(i);
            }
            averageGrade = averageGrade / e.getValue().size();
            finalStudentGrades.put(e.getKey(), averageGrade);
        });
        studentGrades  = studentGrades.entrySet().stream().filter(e -> e.getValue() >= 4.50).sorted(Collections.reverseOrder(Comparator.comparingDouble(Map.Entry ::getValue)))
               .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue,
                       (a, b) -> b, LinkedHashMap :: new));

        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {

            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
