package ClassMethod;

public class  Car {
    public static void main(String[] args) {

    ConstructorCar mercedes = new ConstructorCar("Mercedes", "GLA", 2020, 13000);
    mercedes.info();

    ConstructorCar audi = new ConstructorCar("Audi", "A3 Sportback", 2016, 56000);
    audi.info();

    ConstructorCar syrenka = new ConstructorCar("FSO Syrena", "FSM Syrena 105", 1973, 185000);
    syrenka.info();

}
}
