package jour04.job05;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum à compter :");
        int maxNumber = scanner.nextInt();
        int midPoint = maxNumber / 2;
        long startTime = System.currentTimeMillis();
        CounterThread thread1 = new CounterThread(1, midPoint);
        CounterThread thread2 = new CounterThread(midPoint + 1, maxNumber);

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
        System.out.println("Le comptage est terminé.");
        System.out.println("Somme totale : " + totalSum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
        scanner.close();
    }
}
