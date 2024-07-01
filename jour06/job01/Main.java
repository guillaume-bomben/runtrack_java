package jour06.job01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer une donnée :");
        String input = scanner.nextLine();
        System.out.println("Vous avez entré : " + input);
        scanner.close();
    }
}
