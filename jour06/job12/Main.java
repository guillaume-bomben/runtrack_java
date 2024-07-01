package jour06.job12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un entier positif pour calculer sa factorielle :");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Erreur : Veuillez entrer un entier positif.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Factorielle de " + n + " est : " + factorial);
        }
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

