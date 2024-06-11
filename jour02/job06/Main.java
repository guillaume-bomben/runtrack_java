package jour02.job06;

public class Main {
    public static void main(String[] args) {
        int somme = 0;
        for (int i = 0 ; i<=100 ; i++){
            if (i%2 == 0){
                somme += i;
            }
        }
        System.out.println("La somme des nombres pairs de 0 à 100 est : " + somme);
    }
}
