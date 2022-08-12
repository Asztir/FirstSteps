package Petle;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną a");
        int aNumber = scanner.nextInt();
        System.out.println("Podaj liczbę naturalną b");
        int bNumber = scanner.nextInt();
        System.out.println("Podaj liczbę naturalną c");
        int cNumber = scanner.nextInt();
        System.out.println(numbers(aNumber, bNumber, cNumber));
    }
    public static int numbers(int aNumber, int bNumber, int cNumber){
        if (aNumber >= bNumber && aNumber >= cNumber) {
            return aNumber;
        } else if (bNumber >= aNumber && bNumber >= cNumber) {
            return bNumber;
        } else if (cNumber >= aNumber && cNumber >= bNumber) {
            return cNumber;
        } else if (aNumber == bNumber && aNumber == cNumber) {
            return aNumber;
        }
        return aNumber;
    }
}

