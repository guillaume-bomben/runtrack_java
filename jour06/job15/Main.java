package jour06.job15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier :");
        int number = scanner.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Le nombre inversé est : " + reversedNumber);
        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}

