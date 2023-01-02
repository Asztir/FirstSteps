package ClassMethod;

public class IngeritanceDaughter extends InheritancePerson {

    public String favoriteBook;

    public IngeritanceDaughter(String name, int age, String favoriteBook) {
        super(name, age);
        this.favoriteBook = favoriteBook;

        System.out.println("My name is " + name + " and I'm " + age + ". My favorite book is " + favoriteBook);
    }
}
