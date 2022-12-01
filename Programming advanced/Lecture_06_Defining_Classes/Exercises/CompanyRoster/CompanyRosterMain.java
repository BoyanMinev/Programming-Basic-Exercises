package Lecture_06_Defining_Classes.Exersices.CompanyRoster;

import java.util.*;

public class CompanyRosterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> employeeData = new HashMap<>();
        while (n != 0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            Employee employee = null;
            if (tokens.length == 5){
                try {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    String email = tokens[4];
                    employee = new Employee(name, salary, position, department, email);
                }


            } else if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee = new Employee(name, salary, position, department, email, age);
            }else {
                employee = new Employee(name, salary, position, department);
            }

            employeeData.putIfAbsent(employee.getDepartment(),new Department(employee.getDepartment(), new ArrayList<>()));
            if ( !employeeData.get(employee.getDepartment()).getEmployees().contains(employee)){
                employeeData.get(employee.getDepartment()).getEmployees().add(employee);
            }


            n--;
        }

        Department highestAverageSalary = employeeData.entrySet().stream().max(Comparator.comparing(stringDepartmentEntry -> stringDepartmentEntry.getValue().averageSalary()))
                .get()
                .getValue();
        System.out.printf("Highest Average Salary: %s%n", highestAverageSalary.getDepartmentName());
            highestAverageSalary.getEmployees()
                    .stream()
                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .forEach(System.out::println);
    }
}
