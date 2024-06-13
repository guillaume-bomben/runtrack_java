package jour04.job02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("jour04/job02/output.txt"))) {
            writer.write(randomString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Temps d'exécution : " + executionTime + " ms");
        scanner.close();
    }
}
