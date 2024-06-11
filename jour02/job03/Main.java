package jour02.job03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i<=10;i++){
            System.out.println(i + " * " + n + " = " + i*n);
        }
    }
}
