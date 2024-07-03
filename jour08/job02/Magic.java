package jour08.job02;

abstract class Carte {
    protected int cout;

    public Carte(int cout) {
        this.cout = cout;
        System.out.println(this.getClass().getSimpleName());
    }

    public abstract void afficher();
}

class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur) {
        super(0);
        this.couleur = couleur;
    }

    @Override
    public void afficher() {
        System.out.println("Type: Terrain");
        System.out.println("Couleur: " + couleur);
        System.out.println("Coût: " + cout);
    }
}

class Creature extends Carte {
    private String nom;
    private int pointsDegats;
    private int pointsVie;

    public Creature(String nom, int pointsDegats, int pointsVie, int cout) {
        super(cout);
        this.nom = nom;
        this.pointsDegats = pointsDegats;
        this.pointsVie = pointsVie;
    }

    @Override
    public void afficher() {
        System.out.println("Type: Creature");
        System.out.println("Nom: " + nom);
        System.out.println("Points de dégâts: " + pointsDegats);
        System.out.println("Points de vie: " + pointsVie);
        System.out.println("Coût: " + cout);
    }
}

class Sortilege extends Carte {
    private String nom;
    private String explication;

    public Sortilege(String nom, String explication, int cout) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
    }

    @Override
    public void afficher() {
        System.out.println("Type: Sortilege");
        System.out.println("Nom: " + nom);
        System.out.println("Explication: " + explication);
        System.out.println("Coût: " + cout);
    }
}

class Jeu {
    private Carte[] cartes;
    private int compteur;

    public Jeu() {
        cartes = new Carte[10];
        compteur = 0;
    }

    public void piocher(Carte carte) {
        if (compteur < 10) {
            cartes[compteur++] = carte;
        } else {
            System.out.println("Le jeu est plein!");
        }
    }

    public void jouer() {
        for (int i = 0; i < cartes.length; i++) {
            if (cartes[i] != null) {
                cartes[i].afficher();
                cartes[i] = null;
                break;
            }
        }
    }

    public void afficher() {
        for (Carte carte : cartes) {
            if (carte != null) {
                carte.afficher();
                System.out.println();
            }
        }
    }
}

public class Magic {
    public static void main(String[] args) {
        Jeu jeu = new Jeu();

        // Ajouter différentes cartes au jeu
        jeu.piocher(new Terrain('B'));
        jeu.piocher(new Creature("Dragon", 5, 5, 3));
        jeu.piocher(new Sortilege("Boule de feu", "Inflige 3 dégâts", 2));

        // Afficher les cartes dans le jeu
        System.out.println("Cartes dans le jeu:");
        jeu.afficher();

        // Jouer une carte
        System.out.println("Jouer une carte:");
        jeu.jouer();

        // Afficher les cartes restantes dans le jeu
        System.out.println("Cartes restantes dans le jeu:");
        jeu.afficher();
    }
}

