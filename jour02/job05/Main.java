package jour02.job05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre age : ");
        int age = sc.nextInt();
        sc.close();

        if (age < 16){
            System.out.println("Vous ne pouvez pas travailler");
        }
        else if (age >= 16 && age < 55){
            System.out.println("Vous aurez du mal à trouver du travail");
        }
        else{
            System.out.println("Vous etes trop vieux pour travailler");
        }
    }
}
