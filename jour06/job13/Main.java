package jour06.job13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier n :");
        int n = scanner.nextInt();
        System.out.println("Nombres pairs inférieurs ou égaux à " + n + " :");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}

