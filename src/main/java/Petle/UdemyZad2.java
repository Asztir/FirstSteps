package Petle;
// Wypisz liczby z zakresu 1-100; 1. podzielne przez 3, 2. podzielne przez 2
// odwróć elementy tablicy [1,3,5,7,9] --> [9,7,5,3,1]

public class UdemyZad2 {
    public static void main(String[] args) {
        /*for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println("Jestem podzielna przez 3 : " + i);
            else if (i % 2 == 0)
                System.out.println("Jestem podzielna przez 2 : " + i);*/


        int[] numbers = new int[] {1,3,5,7,9,4};
        for (int i = 0; i<(numbers.length/2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i]; // 6-1-0 // i=0 numbers[0] = numbers[5]
                                                          // 6-1-1 // i=1 numbers[1] = numbers[4]
                                                          // 6-1-2 // i=2 numbers[2] = numbers[3]
            numbers[numbers.length - 1 - i] = temp;
        }
        for (int i =0; i<numbers.length; i++){
            System.out.print(numbers[i]);
        }


    }


}


