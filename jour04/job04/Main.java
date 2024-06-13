package jour04.job04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum à compter :");
        int maxNumber = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Le comptage est terminé.");
        System.out.println("Temps d'exécution : " + executionTime + " ms");

        scanner.close();
    }
}
