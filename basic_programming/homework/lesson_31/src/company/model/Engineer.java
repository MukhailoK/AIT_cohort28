package company.model;

import java.util.Date;

public class Engineer extends Employee {
    private final int Q = 25;

    public Engineer(String name, Date yearOfBirth, int experience, boolean highEducation) {
        super(name, yearOfBirth, experience, highEducation);
    }


    public double getSalary() {
        return Q * 8 * 21 + getExperience() * 0.2;
    }
}
