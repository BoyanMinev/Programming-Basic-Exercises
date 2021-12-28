package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.*;
import java.util.stream.Collectors;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();
        while (!input.equals("end")) {
            List<String> students = new ArrayList<>();
            String[] data = input.split(" : ");
            String course = data[0];
            String student = data[1];
            if (!courses.containsKey(course)) {
                students.add(student);
                courses.put(course, students);
            } else {
                courses.get(course).add(student);

            }

            input = scanner.nextLine();
        }

        courses = courses.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(e -> e.getValue().size())))
                .collect(Collectors.toMap(Map.Entry :: getKey,
                        Map.Entry :: getValue, (e1, e2) -> e2, LinkedHashMap :: new));


        for (Map.Entry<String, List<String>> course: courses.entrySet()) {

            System.out.println(course.getKey() + ":" + " " + course.getValue().size());

            course.setValue(course.getValue().stream().sorted().collect(Collectors.toList()));
            for (String student: course.getValue()) {

                System.out.println("-- " + student);
            }

        }
    }
}
