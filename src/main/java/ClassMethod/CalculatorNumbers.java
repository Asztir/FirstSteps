package ClassMethod;

import java.util.Scanner;

public class CalculatorNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną a");
        int aNumber = scanner.nextInt();
        System.out.println("Podaj liczbę naturalną b");
        int bNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        System.out.println("Dodawanie " + calculator.addition(aNumber, bNumber));
        System.out.println("Odejmowanie " + calculator.substration(aNumber, bNumber));
        System.out.println("Mnożenie " + calculator.multiplication(aNumber, bNumber));
        System.out.println("Dzielenie " + calculator.division(aNumber, bNumber));
        System.out.println("Reszta z dzielenia " + calculator.modulo(aNumber, bNumber));
    }
}
