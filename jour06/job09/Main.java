package jour06.job09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier n :");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }
        System.out.println("La somme des " + n + " premiers cubes est : " + sum);
        scanner.close();
    }
}
