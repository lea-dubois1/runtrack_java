public class VoitureTest {

    public static class Voiture {
        int vitesse = 0;

        public void demare() {
            System.out.println("La voiture démarre.");
        }

        public void accelere() {
            this.vitesse += 10;
            System.out.println("La vitesse est maintenant de " + this.vitesse + "km/h.");
        }

        public void arret() {
            this.vitesse = 0;
            System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0 km/h.");
        }
    }

    public static void main(String[] args) {
        Voiture vroum = new Voiture();
        vroum.demare();
        vroum.accelere();
        vroum.accelere();
        vroum.arret();
    }
}