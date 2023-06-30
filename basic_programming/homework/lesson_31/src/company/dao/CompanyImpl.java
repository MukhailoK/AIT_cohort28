package company.dao;

import company.model.Employee;
import company.model.Engineer;
import company.model.Worker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Predicate;

public class CompanyImpl extends Company {
    private Employee[] employees;
    private int size;

    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
    }

    private boolean isPresent(Employee employee) {
        if (employee != null) {
            for (Employee e : employees) {
                if (employee.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean hireEmployee(Employee employee) {
        if (!isPresent(employee) || size == 0) {
            employees[size] = employee;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public Employee fireEmployee(Employee employee) {
        if (isPresent(employee)) {
            for (int i = 0, j = 0; i < size; i++) {
                if (employees[i].equals(employee)) {
                    employees[i] = null;
                    size--;
                }
                employees[j] = employees[i];
            }
            return employee;
        }
        return null;
    }

    @Override
    public Employee found(String name, Date date) {
        Employee e = null;
        for (Employee empl : employees) {
            if (empl.getName().equals(name) && empl.getYearOfBirth() == date) {
                e = empl;
                return e;
            }
        }
        return e;
    }

    @Override
    public int getNumberOfEmployees() {
        return size;
    }

    @Override
    public void printAll() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public Employee[] foundWithOutHighEducation() {
        return findByPredicate(e -> e != null && !e.isHighEducation());
    }

    public Employee[] foundEmployeesWithExpMore5Years() {
        return findByPredicate(e -> e != null && e.getExperience() > 5);
    }

    public Employee[] foundEmployeesWithSalaryLess2000Euro() {
        return findByPredicate(employee -> {
            if (employee instanceof Worker) {
                return ((Worker) employee).getSalary() < 2000;
            } else if (employee instanceof Engineer) {
                return ((Engineer) employee).getSalary() < 2000;
            } else {
                return false;
            }
        });
    }

    private Employee[] findByPredicate(Predicate<Employee> predicate) {
        Employee[] emp;
        int count = 0;
        for (Employee e : employees) {
            if (predicate.test(e)) {
                count++;
            }
        }
        emp = new Employee[count];

        for (int i = 0, j = 0; i < size; i++) {
            if (predicate.test(employees[i])) {
                emp[j] = employees[i];
                j++;
            }
        }
        return emp;
    }

    public Employee[] getEmployeesByAge() {
        Comparator<Employee> comparator = Comparator.comparing(Employee::getYearOfBirth);
        Employee[] sortedEmployees = Arrays.copyOf(employees, size);
        Arrays.sort(sortedEmployees, comparator);

        return sortedEmployees;
    }

    public Employee[] getEmployeesByExp() {
        Comparator<Employee> comparator = Comparator.comparingInt(employee -> -employee.getExperience());
        Employee[] sortedEmployees = Arrays.copyOf(employees, size);
        Arrays.sort(sortedEmployees, comparator);

        return sortedEmployees;
    }

    public Employee[] getEmployeesBySalary() {
        Comparator<Employee> comparator = Comparator.comparingDouble(employee -> {
            if (employee instanceof Engineer) {
                return ((Engineer) employee).getSalary();
            } else if (employee instanceof Worker) {
                return ((Worker) employee).getSalary();
            } else {
                return 0.0;
            }
        });

        Employee[] sortedEmployees = Arrays.copyOf(employees, size);
        Arrays.sort(sortedEmployees, comparator);

        return sortedEmployees;
    }
}
