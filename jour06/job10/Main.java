package jour06.job10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre âge :");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else {
            System.out.println("Vous êtes majeur.");
        }
        scanner.close();
    }
}

