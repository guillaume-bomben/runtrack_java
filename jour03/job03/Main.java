package jour03.job03;

public class Main {
    public static void main(String[] args) {
        String[] noms = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(noms[1]);
        noms[2] = "Mireille";
        for (String nom : noms) {
            System.out.println(nom);
        }
    }
}

