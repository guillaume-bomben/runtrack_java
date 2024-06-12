package jour03.job05;

public class Main {
    public static void main(String[] args) {
        int[] nombres = {3, 7, 3, 9, 8, 7};
        boolean[] counted = new boolean[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            if (!counted[i]) {
                boolean isUnique = true;
                for (int j = 0; j < nombres.length; j++) {
                    if (i != j && nombres[i] == nombres[j]) {
                        isUnique = false;
                        counted[j] = true; 
                    }
                }
                if (isUnique) {
                    System.out.println(nombres[i]);
                }
                counted[i] = true;
            }
        }
    }
}
