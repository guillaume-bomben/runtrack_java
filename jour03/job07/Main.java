package jour03.job07;
public class Main {
    public static void main(String[] args) {
        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Valeurs de matrice1:");
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] resultat = new int[3][3];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        System.out.println("\nRésultat de l'addition de matrice1 et matrice2:");
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[i].length; j++) {
                System.out.print(resultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
