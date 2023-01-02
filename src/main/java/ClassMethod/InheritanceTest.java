package ClassMethod;

public class InheritanceTest {
    public static void main(String[] args) {
        InheritanceSon inheritanceSon = new InheritanceSon("Gabriel", 12, "lego");
        inheritanceSon.eat();

        IngeritanceDaughter ingeritanceDaughter = new IngeritanceDaughter("Marta", 14, "Alice in Wonderland");
        ingeritanceDaughter.eat();
    }
}
