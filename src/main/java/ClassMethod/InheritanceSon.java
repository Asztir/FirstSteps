package ClassMethod;

public class InheritanceSon extends InheritancePerson {

    public String favoriteToy;

    public InheritanceSon(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;

        System.out.println("I like " + favoriteToy);
    }
}
