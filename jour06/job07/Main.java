package jour06.job07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;  
        int number;  
        System.out.println("Veuillez entrer cinq entiers :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez l'entier " + (i + 1) + " : ");
            number = scanner.nextInt();
            sum += number;
        }
        double average = sum / 5.0;
        System.out.println("La moyenne des cinq entiers est : " + average);
        scanner.close();
    }
}

