package jour04.job03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la longueur de la chaîne de caractères aléatoire à générer :");
        int length = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        String randomString = generateRandomString(length);

        Thread thread1 = new Thread(new WriteTask(randomString.substring(0, length / 2), "jour04/job03/output.txt", false));
        Thread thread2 = new Thread(new WriteTask(randomString.substring(length / 2), "jour04/job03/output.txt", true));
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Temps d'exécution : " + executionTime + " ms");
        scanner.close();
    }
}

