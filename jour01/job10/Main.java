package jour01.job10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nom: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez un prénom: ");
        String prenom = scanner.nextLine();

        System.out.println("Bonjour " + prenom + " " + nom + "!");

        scanner.close();
    }
}
