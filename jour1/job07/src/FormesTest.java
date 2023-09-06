import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormesTest {
    public static class Cercle {
        int rayon = 5;

        public double calculAire() {
            return (double) Math.round((Math.PI * (this.rayon * this.rayon)) * 100) / 100;
        }
    }

    public static class Carre {
        int cote = 4;

        public double calculAire() {
            return this.cote * this.cote;
        }

    }

    public static void main(String[] args) {
        Cercle cercle = new Cercle();
        Carre carre = new Carre();

        System.out.println("Aire du cercle de rayon 5: " + cercle.calculAire());
        System.out.println("Aire du crré de côté 4: " + carre.calculAire());
    }
}