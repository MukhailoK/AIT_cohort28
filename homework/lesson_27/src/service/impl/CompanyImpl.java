package service.impl;

import model.Employee;
import model.SalesManager;
import service.Company;

public class CompanyImpl implements Company {
    private Employee[] employees;
    private int size;

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    private boolean iPresent(Employee employee) {
        for (Employee e : employees) {
            if (employee.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employees.length > size && employee != null && !iPresent(employee)) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = employee;
                    size++;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee employee = findEmployee(id);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == employee) {
                employees[i] = null;
                size--;
            }
        }
        return employee;
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee employee : employees) {

            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        if (employees.length != 0) {
            double total = 0;
            for (Employee e : employees) {
                if (e != null) {
                    total += e.calcSalary();
                }
            }
            return total;
        }
        return 0.0;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double sales = 0.0;
        for (Employee e : employees) {
            if (e instanceof SalesManager) {
                sales += ((SalesManager) e).getSalesValue();
            }
        }
        return sales;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
