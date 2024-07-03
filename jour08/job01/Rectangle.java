package jour08.job01;

class Rectangle {
    protected double largeur;
    protected double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle :\n" + " largeur = " + largeur + "\n" + " hauteur = " + hauteur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.largeur, largeur) == 0 && Double.compare(rectangle.hauteur, hauteur) == 0;
    }
}