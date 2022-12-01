package Lecture_06_Defining_Classes.Exersices.CompanyRoster;

import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees;


    public Department(String departmentName, List<Employee> employees){

        this.departmentName = departmentName;

        this.employees = employees;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public double averageSalary(){

        int numOfEmployees = employees.size();

        double allSalaries = 0;
        for (Employee employee: employees) {
            allSalaries += employee.getSalary();
        }

        return allSalaries / numOfEmployees;


    }



}
