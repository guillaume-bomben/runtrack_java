package jour02.job08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        String numero = sc.nextLine();
        sc.close();

        System.out.println("Dans le numero " + numero + " il y a : " + numero.length() + " chiffres");
    }
}
