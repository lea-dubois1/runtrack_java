public class Voiture {
    int vitesse = 0;
    String marque = "BMW";
    String couleur = "rouge";

    public void demare() {
        System.out.println("La voiture démarre.");
    }

    public String accelere(int ajoutVitesse) throws ExceptionVitesse {
        this.vitesse += ajoutVitesse;
        if(this.vitesse > 100) {
            throw new ExceptionVitesse();
        }
        return "La vitesse est maintenant de " + this.vitesse + "km/h.";
    }

    public void arret() {
        this.vitesse = 0;
        System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0 km/h.");
    }
}
