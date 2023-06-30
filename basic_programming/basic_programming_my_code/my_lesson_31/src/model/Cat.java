package model;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {
    private String name;
    private int weight;
    private String color;
    private Integer age;

    public Cat(String name, int weight, String color, Integer age) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }





    @Override
    public int compareTo(Cat o) {
        return getAge()-o.getAge();
    }
}
