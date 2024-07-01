package jour06.job14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier n (inférieur ou égal à 9) :");
        int n = scanner.nextInt();
        if (n < 1 || n > 9) {
            System.out.println("Erreur : Veuillez entrer un nombre entier inférieur ou égal à 9.");
        } else {
            System.out.println("Table de multiplication de " + n + " :");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
        scanner.close();
    }
}

