package jour06.job02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre prénom :");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour " + prenom);
        scanner.close();
    }
}

