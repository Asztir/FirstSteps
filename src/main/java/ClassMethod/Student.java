package ClassMethod;

public class Student {
    public String name;
    public String surname;
    public String nick;
    public String email;
    public int indexNumber;

    public void introduce () {
        System.out.println("My name is " + name + " " + surname );
    }

    public void login () {
        System.out.println("My nick name is " + nick + " and my email address is " + email);
    }

    public void id () {
        System.out.println("My index number is " + indexNumber);
    }
}
