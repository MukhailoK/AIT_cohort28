package company.model;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private final Date yearOfBirth;
    private int experience;
    private boolean highEducation;

    public Employee(String name, Date yearOfBirth, int experience, boolean highEducation) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.experience = experience;
        this.highEducation = highEducation;
    }

    public boolean isHighEducation() {
        return highEducation;
    }

    public void setHighEducation(boolean highEducation) {
        this.highEducation = highEducation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (highEducation != employee.highEducation) return false;
        if (!Objects.equals(name, employee.name)) return false;
        return Objects.equals(yearOfBirth, employee.yearOfBirth);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + yearOfBirth.hashCode();
        return result;
    }
}
