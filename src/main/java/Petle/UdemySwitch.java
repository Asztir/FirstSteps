package Petle;
    // Podaj ceny do wybranej kawy

import java.util.Scanner;

public class UdemySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Our menu includes four types of coffee: black, white, cappuccino and latte.");
        System.out.println("Please give me the type of coffee and I will give you the price:");
        String coffe = scanner.nextLine();

        switch (coffe) {
            case "black":
                System.out.println("Black coffee costs 5 euro");
                break;
            case "white":
                System.out.println("White coffee costs 7 euro");
                break;
            case "cappuccino":
                System.out.println("Cappuccino coffee costs 9 euro");
                break;
            case "latte":
                System.out.println("Latte coffee costs 11 euro");
                break;
            default:
                System.out.println("I don't have such coffee on the menu");

        }
    }
}
