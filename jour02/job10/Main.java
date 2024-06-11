package jour02.job10;

public class Main {
    public static void main(String[] args) {
        int number = 1234;
        String nombreStr = Integer.toString(number);
        int somme = 0;
        for (int i = 0; i < nombreStr.length(); i++) {
            somme += Character.getNumericValue(nombreStr.charAt(i));
        }
        System.out.println("La somme des chiffres est : " + somme);
    }
}
