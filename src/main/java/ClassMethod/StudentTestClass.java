package ClassMethod;

public class StudentTestClass {
    public static void main(String[] args) {

        Student.infoStudy();

        Student studentMickey = new Student();
        studentMickey.name = "Mickey";
        studentMickey.surname = "Mouse";
        studentMickey.nick = "Mickey";
        studentMickey.email = "mickey@disney.com";
        studentMickey.indexNumber = 101;

        Student studentMinnie = new Student();
        studentMinnie.name = "Minnie";
        studentMinnie.surname = "Mouse";
        studentMinnie.nick = "Minnie";
        studentMinnie.email = "minnie@disney.com";
        studentMinnie.indexNumber = 102;

        Student studentDonald = new Student();
        studentDonald.name = "Donald";
        studentDonald.surname = "Duck";
        studentDonald.nick = "Donald";
        studentDonald.email = "donald@disney.com";
        studentDonald.indexNumber = 103;

        Student studentDaisy = new Student();
        studentDaisy.name = "Daisy";
        studentDaisy.surname = "Duck";
        studentDaisy.nick = "Daisy";
        studentDaisy.email = "daisy@disney.com";
        studentDaisy.indexNumber = 104;

        Student[] students = new Student[4];
        students[0] = studentMickey;
        students[1] = studentMinnie;
        students[2] = studentDonald;
        students[3] = studentDaisy;

        for (int i = 0; i < students.length; i++){
            students[i].introduce();
            students[i].login();
            students[i].id();
        }
    }
}
