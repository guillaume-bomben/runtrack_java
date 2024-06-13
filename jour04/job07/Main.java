package jour04.job07;

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
        int midPoint = size / 2;
        SumThread thread1 = new SumThread(numbers, 0, midPoint);
        SumThread thread2 = new SumThread(numbers, midPoint, size);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int totalSum = thread1.getSum() + thread2.getSum();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");

        scanner.close();
    }
}
