package jour04.job06;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau :");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        long startTime = System.currentTimeMillis();

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("La somme totale est : " + sum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");

        scanner.close();
    }
}
