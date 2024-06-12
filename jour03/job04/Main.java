package jour03.job04;

public class Main {
    public static void main(String[] args) {
        int[] nombres = {3, 7, 3, 9, 8};
        boolean[] counted = new boolean[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < nombres.length; j++) {
                    if (nombres[i] == nombres[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println("Nombre " + nombres[i] + ": " + count + " occurrence(s)");
            }
        }
    }
}
