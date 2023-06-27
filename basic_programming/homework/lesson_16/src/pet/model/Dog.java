package pet.model;

public class Dog extends Pet {
    private final String name;
    private final String poroda;
    private final int age;

    public Dog(String type, double high, boolean leaving, String name, String poroda, int age) {
        super(type, high, leaving);
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public int getAge() {
        return age;
    }

    public void voice() {
        System.out.println(name + " say Wof");
    }

    public void run() {
        System.out.println(name + " is walking");
    }

    public void sleep() {
        System.out.println(name + " is sleep");
    }

    public void eat() {
        System.out.println(name + " is eat shshshshs");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                super.toString() + '}';
    }
}
