package jour03.job08;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        System.out.println("Matrice originale:");
        afficherMatrice(tableau);

        int[] elements = new int[tableau.length * tableau[0].length];
        int index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                elements[index++] = tableau[i][j];
            }
        }
        Arrays.sort(elements);

        index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = elements[index++];
            }
        }

        System.out.println("Matrice triée:");
        afficherMatrice(tableau);
    }

    public static void afficherMatrice(int[][] matrice) {
        for (int[] ligne : matrice) {
            for (int valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }
}

