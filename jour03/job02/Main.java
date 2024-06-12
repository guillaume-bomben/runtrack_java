package jour03.job02;

public class Main {
    public static void main(String[] args) {
        int[] nomTableau = {12,6,76,89};
        for (int i : nomTableau) {
            System.out.println(i);
        }

        nomTableau[2] = 0;
        System.out.println("index 2 : " + nomTableau[2]);
    }
}
