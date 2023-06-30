package company.dao;

import company.model.Employee;

import java.util.Date;

public abstract class Company {
    public abstract boolean hireEmployee(Employee employee);

    public abstract Employee fireEmployee(Employee employee);

    public abstract Employee found(String name, Date date);

    public abstract int getNumberOfEmployees();

    public abstract void printAll();
}
