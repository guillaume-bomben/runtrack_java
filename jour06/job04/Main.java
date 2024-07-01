package jour06.job04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom :");
        String nom = scanner.nextLine();
        System.out.println("Bienvenue, " + nom + "!");
        scanner.close();
    }
}

