package ait.employee.model;

public class Employee {
    private boolean gender;
    private int id;
    private String name;
    private double salary;
    private String birthday;

    public Employee() {
    }

    public Employee(int id, String name, double salary, String birthday, boolean gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
        this.gender = gender;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday='" + birthday + '\'' +
                ", gender='" + (gender ? "male" : "female") + '\'' +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
