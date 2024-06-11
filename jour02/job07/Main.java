package jour02.job07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int factorielle = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i<=n; i++){
            factorielle *= i;
        }
        System.out.println("La factorielle de " + n + " est : " + factorielle);
    }
}
