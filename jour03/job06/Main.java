package jour03.job06;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] nombres = new int[10];
        Random random = new Random();
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = random.nextInt(100);
        }

        System.out.println("Tableau des nombres aléatoires :");
        for (int nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

