package jour04.job08;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static final int MAX_NUMBER = 10_000_000;
    private static final int NUM_THREADS = 10;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<Long>> futures = new ArrayList<>();
        int chunkSize = MAX_NUMBER / NUM_THREADS;
        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * chunkSize + 1;
            int end = (i == NUM_THREADS - 1) ? MAX_NUMBER : start + chunkSize - 1;
            futures.add(executor.submit(new SumTask(start, end)));
        }

        long totalSum = 0;
        for (Future<Long> future : futures) {
            try {
                totalSum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}
