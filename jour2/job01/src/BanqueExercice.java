import java.util.Arrays;
abstract class CompteBancaire {
    double solde;
    String compteType;

    public void setSolde(double inputSolde) {
        solde = inputSolde;
    }

    public void display() {
        System.out.println("Solde du compte " + compteType + ": " + solde + "€");
    }
}

class CompteCourant extends CompteBancaire {
    String compteType = "courant";
}

class CompteEpargne extends CompteBancaire {
    double tauxInt;
    String compteType = "epargne";

    public void setInteret(double interet) {
        this.tauxInt = interet;
    }

    public void displayWithInteret() {
        double interetAjout = (double) this.solde * (this.tauxInt / 100);

        this.solde += interetAjout;

        System.out.println("Intérêts ajoutés: " + interetAjout + "€. Nouveau solde: " + this.solde + "€");
    }

    public void display() {
        System.out.println("Solde du compte " + compteType + ": " + solde + "€ avec un taux d'intérêt de " + this.tauxInt + "%");
    }
}

public class BanqueExercice {

    public static void main(String[] args) {
        double soldeCourant = Integer.parseInt(args[0]);
        double soldeEpargne = Integer.parseInt(args[1]);
        int tauxInteret = Integer.parseInt(args[2]);

        CompteCourant courant = new CompteCourant();
        CompteEpargne epargne = new CompteEpargne();

        courant.setSolde(soldeCourant);
        courant.display();

        epargne.setSolde(soldeEpargne);
        epargne.setInteret(tauxInteret);
        epargne.display();
        epargne.displayWithInteret();
    }
}