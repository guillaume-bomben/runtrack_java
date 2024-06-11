package jour02.job11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre superieur ou egale a 1 : ");
        int numero = sc.nextInt();
        sc.close();

        for (int i = 1; i <= numero; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
