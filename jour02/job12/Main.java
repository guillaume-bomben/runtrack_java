package jour02.job12;

public class Main {
    public static void main(String[] args) {
        int faces = 6;
        int totalCombinaisons = 0;
        for (int de1 = 1; de1 <= faces; de1++) {
            for (int de2 = 1; de2 <= faces; de2++) {
                for (int de3 = 1; de3 <= faces; de3++) {
                    System.out.println("(" + de1 + ", " + de2 + ", " + de3 + ")");
                    totalCombinaisons++;
                }
            }
        }
        System.out.println("Nombre total de combinaisons possibles : " + totalCombinaisons);
    }
}
