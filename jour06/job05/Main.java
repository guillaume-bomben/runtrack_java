package jour06.job05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre :");
        double nombre = scanner.nextDouble();
        double carre = nombre * nombre;
        System.out.println("Le carré de " + nombre + " est " + carre);
        scanner.close();
    }
}

