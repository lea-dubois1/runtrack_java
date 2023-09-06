import java.util.Scanner;

public class BanqueTest {

    public static class CompteBancaire {
        int solde = 100;

        public void depose(int num) {
            this.solde += num;
            System.out.println(num + "€ déposés. Nouveau solde: " + this.solde + "€");
        }

        public void retire(int num) {
            if (solde > num){
                this.solde -= num;
                System.out.println(num + "€ retirés. Nouveau solde: " + this.solde + "€");
            }else {
                System.out.println("Tentative de retrait de " + num + "€... Solde insuffisant!");
            }
        }

        public void display() {
            System.out.println("Solde actuel: " + this.solde + "€");
        }
    }

    public static void main(String[] args) {
        CompteBancaire money = new CompteBancaire();

        money.display();
        money.depose(50);
        money.retire(80);
        money.retire(90);
    }
}