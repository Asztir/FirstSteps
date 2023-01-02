package ClassMethod;

public class ConstructorCar {
    public String carName;
    public String model;
    public int year;
    public int course;

    public ConstructorCar(String carName, String model, int year, int course ) {
        System.out.println("Car properties");
        this.carName = carName;
        this.model = model;
        this.year = year;
        this.course = course;
    }

    public void info() {

        System.out.println("Car name: " + carName);
        System.out.println("Car model: " + model);
        System.out.println("Year of production: " + year);
        System.out.println("Course of car: " + course);

    }
}
