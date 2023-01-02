package ClassMethod;

public class UserTest {
    public static void main(String[] args) {
       /*User user = new User();
        user.username = "Hermenegilda";
        user.password = "QWERTY";
        user.sayHello();*/

        User user = new User("Alicja", "Królowa");
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();


    }
}