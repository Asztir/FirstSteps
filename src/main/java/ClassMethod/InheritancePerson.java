package ClassMethod;

public class InheritancePerson {
    public String name;
    public int age;

    public InheritancePerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("My name is " + name + " and I'm " + age);
    }

    public void eat() {
        System.out.println("I like pizza");
    }


}
