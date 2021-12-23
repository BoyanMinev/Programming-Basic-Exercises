package L_06_ObjectAndClasses.MoreExercises.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();
        String email = null;
        int age = 0;
        double maxSalary = Double.NEGATIVE_INFINITY;
        String highestSalaryDepartment = null;
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            if (data.length == 5) {
                String data1 = data[4];
                boolean isExistEmail = false;
                for (int j = 0; j < data1.length(); j++) {
                    if (data1.charAt(j) == 64) {
                        email = data1;
                        age = -1;
                        isExistEmail = true;
                    }
                }
                if (!isExistEmail) {
                    age = Integer.parseInt(data1);
                    email = "n/a";
                }
            } else if (data.length == 4) {
                email = "n/a";
                age = -1;
            } else {
                email = data[4];
                age = Integer.parseInt(data[5]);
            }
            Employee employee = new Employee(name, salary, position, department,
                    email, age);

            employees.add(employee);
        }

        double salaryTemp = 0;
        double averageSalary = 0;
        int countEmployees = 0;
        String departmentTemp = null;
        for (int i = 0; i < employees.size(); i++) {

            List<Employee> temp = new ArrayList<>();
            temp.addAll(employees);
            countEmployees = 1;
            salaryTemp = 0;
            salaryTemp = salaryTemp + temp.get(i).getSalary();
            departmentTemp = temp.get(i).getDepartment();
            temp.remove(i);
            for (int j = 0; j < temp.size(); j++) {
                if (departmentTemp.equals(temp.get(j).getDepartment())) {
                    salaryTemp = salaryTemp + temp.get(j).getSalary();
                    countEmployees++;
                    temp.remove(j);
                    j = -1;
                }
            }
            averageSalary = salaryTemp / countEmployees;
            if (averageSalary > maxSalary) {
                maxSalary = averageSalary;
                highestSalaryDepartment = employees.get(i).getDepartment();
            }
        }
        List<Employee> employeeSortByDepartment = new ArrayList<>();

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getDepartment().equals(highestSalaryDepartment)) {
                employeeSortByDepartment.add(employees.get(i));
            }
        }
        employeeSortByDepartment.sort(Comparator.comparingDouble(Employee::getSalary));
        Collections.reverse(employeeSortByDepartment);
        System.out.println("Highest Average Salary: " + highestSalaryDepartment);
        for (Employee emp :
                employeeSortByDepartment) {
            System.out.println(emp.toString());
        }
    }


}

