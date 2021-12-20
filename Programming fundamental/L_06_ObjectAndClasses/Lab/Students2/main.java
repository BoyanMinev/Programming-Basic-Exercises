package L_06_ObjectAndClasses.Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")){
            String[] dataStudent = input.split(" ");


            String firstName = dataStudent[0];
            String lastName = dataStudent[1];
            int age =Integer.parseInt(dataStudent[2]);
            String homeTown = dataStudent[3];


                if (isStudentExisting(students, firstName, lastName )){
                    Student student = getStudent(students, firstName, lastName);
                    student.setFirstName(firstName);
                    student.setLastName(lastName);
                    student.setAge(age);
                    student.setHometown(homeTown);

                }else {
                    Student student = new Student(firstName, lastName, age, homeTown);
                    students.add(student);
                }

        input = scanner.nextLine();
        }
        String town = scanner.nextLine();

        for (Student student :
                students) {
            if (student.getHometown().equals(town)){

                System.out.printf("%s %s is %d years old", student.getFirstName(), student.getLastName(), student.getAge());
                System.out.println();
            }
        }

    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student :
                students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {

        for (Student student :
                students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
