package jour06.job03;

public class Main {
    public static void main(String[] args) {
        int[] T = new int[10];
        for (int i = 0; i < 10; i++) {
            T[i] = i;
        }
        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);
        try {
            System.out.println("T[10] = " + T[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("T[10] est hors des limites du tableau.");
        }
    }
}
