public class Boite <T> {
    T elem;
    public void ajout(T valeur) {
        this.elem = valeur;
        System.out.println("CContenu de la boîte: " + (String) this.elem);
    }

    public void suppr() {
        this.elem = null;
        System.out.println("Contenu de la boîte: ");
    }
}
