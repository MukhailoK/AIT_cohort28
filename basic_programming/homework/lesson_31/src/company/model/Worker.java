package company.model;

import java.util.Date;

public class Worker extends Employee{
    private final int Q = 10;

    public Worker(String name, Date yearOfBirth, int experience, boolean highEducation) {
        super(name, yearOfBirth, experience, highEducation);
    }

    public double getSalary() {
        return Q * 8 * 21 * getExperience() * 0.3;
    }
}
