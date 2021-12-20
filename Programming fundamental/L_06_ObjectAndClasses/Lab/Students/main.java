package L_06_ObjectAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while(!input.equals("end")){

            String[] dataStudent = input.split(" ");

            Student student = new Student();

            student.setFirstName(dataStudent[0]);
            student.setLastName(dataStudent[1]);
            student.setAge(Integer.parseInt(dataStudent[2]));
            student.setHometown(dataStudent[3]);
            students.add(student);
            input = scanner.nextLine();
        }
        String nameTown = scanner.nextLine();

        List<Student> filterStudent = students.stream().filter(e->e.getHometown().equals(nameTown))
                .collect(Collectors.toList());
        for (Student student :
                filterStudent) {
            System.out.printf("%s %s is %d years old", student.getFirstName(), student.getLastName(),
                    student.getAge());
            System.out.println();
        }
    }
}
