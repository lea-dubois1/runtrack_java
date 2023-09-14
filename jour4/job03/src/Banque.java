public class Banque {
    private int solde;

    public Banque(int inputSolde) {
        this.solde = inputSolde;
    }

    public synchronized void retire(int amount) {
        this.solde -= amount;
        System.out.println(Thread.currentThread().getName() + " a retiré " + amount);
    }

    public void display() {
        System.out.println("Solde final: " + this.solde);
    }
}
