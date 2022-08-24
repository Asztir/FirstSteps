package Petle;
/* Zapytaj o wiek użytkownika.
Gdy ma mniej niż 18 lat wypisz na ekranie informację o tym iż nie może dokonać zakupu.
Gdy ma więcej niż 18 lat podzikuj za zakupy
 */

import java.util.Scanner;

public class UdemyZad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();
        if (age < 18 && age >= 0) {
            System.out.println("Nie możesz dokonać zakupu");
        } else if (age < 0) {
            System.out.println("Podaj liczbę dodatnią");
        }
            System.out.println("Dziękujemy za zakupy");
        }
    }