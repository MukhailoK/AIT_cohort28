package ait.employee;

import ait.employee.model.Employee;

public class EmployeeApp {
    public static void main(String[] args) {

        System.out.println("=======Employee model=======");

        double totalSalary = 0;
        Employee employee = new Employee();
        Employee employee1 = new Employee();

        employee.setId(1);
        employee.setName("John");
        employee.setSalary(1500);
        employee.setBirthday("15.02.1987");
        employee.setGender(true);

        employee1.setId(2);
        employee1.setName("Sarah");
        employee1.setSalary(1600);
        employee1.setBirthday("12.06.2123");
        employee1.setGender(false);

        System.out.println("\nto string:\n");
        System.out.println("Employee 1");
        employee.display();
        System.out.println("\nEmployee 2");
        employee1.display();

        totalSalary = employee.getSalary() + employee1.getSalary();
        System.out.println("\nTotal salary: " + totalSalary);
    }
}