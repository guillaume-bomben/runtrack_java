package jour06.job06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le premier nombre :");
        double nombre1 = scanner.nextDouble();
        System.out.println("Veuillez entrer le deuxième nombre :");
        double nombre2 = scanner.nextDouble();
        System.out.println("Veuillez entrer le troisième nombre :");
        double nombre3 = scanner.nextDouble();
        double max = Math.max(nombre1, Math.max(nombre2, nombre3));
        System.out.println("Le maximum des trois nombres est : " + max);
        scanner.close();
    }
}
