package pet.model;

public class Cat extends Pet {

    private final String name;
    private final String poroda;
    private final int age;

    public Cat(String type, double high, boolean leaving, String name, String poroda, int age) {
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

    public void eat() {
        System.out.println(name + " eat Mrrr-Mrrr");
    }

    public void sleep() {
        System.out.println(name + "mrrr-mrrr-mrrr-mrrr-mrr-mrrr-mrrr");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                super.toString() + '}';
    }

    public void voice() {
        System.out.println(name + " say Meow");
    }
}
