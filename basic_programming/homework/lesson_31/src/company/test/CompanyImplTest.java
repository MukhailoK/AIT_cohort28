package company.test;


import company.dao.CompanyImpl;
import company.model.Employee;
import company.model.Engineer;
import company.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyImplTest {

    private CompanyImpl company;

    @BeforeEach
    public void setUp() {
        company = new CompanyImpl(10);

    }

    @Test
    public void testHireEmployee() {
        Date date = new Date(1992, 4, 4);
        Employee employee = new Engineer("John Doe", date, 10, true);
        boolean hired = company.hireEmployee(employee);
        assertTrue(hired);
    }

    @Test
    public void testFireEmployee() {
        Date date = new Date(1994, 7, 4);
        Employee employee = new Worker("Jane Smith", date, 5, false);
        company.hireEmployee(employee);
        Employee firedEmployee = company.fireEmployee(employee);
        assertNotNull(firedEmployee);
        assertEquals(employee, firedEmployee);
    }

    @Test
    public void testFoundEmployee() {
        Date date = new Date(1982, 2, 12);
        Employee employee = new Engineer("John Doe", date, 10, true);
        company.hireEmployee(employee);
        Employee foundEmployee = company.found("John Doe", date);
        assertNotNull(foundEmployee);
        assertEquals(employee, foundEmployee);
    }

    @Test
    public void testGetNumberOfEmployees() {
        Date date = new Date(1985, 7, 4);
        Employee employee1 = new Engineer("John Doe", date, 10, true);
        date = new Date(1985, 7, 4);
        Employee employee2 = new Engineer("Mike Doe", date, 10, false);
        date = new Date(1985, 7, 4);
        Employee employee3 = new Engineer("John Nilson", date, 5, true);
        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        company.hireEmployee(employee3);
        int numberOfEmployees = company.getNumberOfEmployees();
        assertEquals(3, numberOfEmployees);
    }

    @Test
    public void testFoundWithOutHighEducation() {
        Date date = new Date(1985, 7, 4);
        Employee employee1 = new Engineer("John Doe", date, 10, false);
        date = new Date(1985, 7, 4);
        Employee employee2 = new Engineer("John Nilson", date, 5, true);
        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        Employee[] employees = company.foundWithOutHighEducation();
        assertEquals(1, employees.length);
        assertEquals(employee1.getName(), employees[0].getName());
    }

    @Test
    void testFoundEmployeesWithSalaryLess2000Euro() {
        Date date = new Date(1985, 7, 4);
        Employee employee1 = new Engineer("John Doe", date, 10, true);
        date = new Date(1990, 4, 22);
        Employee employee2 = new Worker("Jane Smith", date, 3, false);
        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        company.printAll();
        Employee[] employees = company.foundEmployeesWithSalaryLess2000Euro();
        assertEquals(1, employees.length);
        assertEquals(employee2, employees[0]);
    }

    @Test
    void testFoundEmployeesWithExpMore5Years() {
        Date date = new Date(1985, 7, 4);
        Employee employee1 = new Engineer("John Doe", date, 10, true);
        company.hireEmployee(employee1);

        Employee[] employees = company.foundEmployeesWithExpMore5Years();
        assertEquals(1, employees.length);
    }

    @Test
    void getEmployeesByAge() {
        Date date = new Date(1992, 7, 4);
        Employee employee1 = new Engineer("John Doe", date, 10, true);
        date = new Date(1990, 4, 22);
        Employee employee2 = new Worker("Jane Smith", date, 3, false);
        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        Employee[] employees = company.getEmployeesByAge();
        assertEquals(2, employees.length);
        company.printAll();
    }

    @Test
    public void testGetEmployeesByExp() {
        Employee employee1 = new Worker("John Doe", new Date(1996, 12, 25), 2, true);
        Employee employee2 = new Engineer("Jane Smith", new Date(1996, 12, 25), 5, false);
        Employee employee3 = new Worker("Mary Johnson", new Date(1996, 12, 25), 1, false);
        employee2.setExperience(6);
        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        company.hireEmployee(employee3);

        Employee[] result = company.getEmployeesByExp();
        Employee[] expected = new Employee[]{employee2, employee1, employee3};
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetEmployeesBySalary() {
        Employee employee1 = new Worker("John Doe", new Date(1996, 12, 25), 2, true);
        Employee employee2 = new Engineer("Jane Smith", new Date(1996, 12, 25), 5, false);
        Employee employee3 = new Worker("Mary Johnson", new Date(1996, 12, 25), 1, false);
        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        company.hireEmployee(employee3);

        Employee[] result = company.getEmployeesBySalary();
        Employee[] expected = new Employee[]{employee3, employee1, employee2};
        assertArrayEquals(expected, result);
    }

    @Test
    void printAll() {
        company.printAll();
    }
}
