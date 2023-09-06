import java.util.Arrays;

public class EtudiantTest {
    public static class Etudiant {
        String name = "Bob";
        int[] notes = {15, 12, 18, 10};

        public int plusHaute() {
            Arrays.sort(this.notes);
            return notes[notes.length-1];
        }

        public int plusBasse() {
            Arrays.sort(this.notes);
            return notes[0];
        }

        public double moyenne() {
            double total = 0;

            for(int note : this.notes) {
                total += note;
            }

            double moyenne = total / this.notes.length;

            return moyenne;
        }
    }

    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant();

        System.out.println("Nom de l'étudiant: " + etudiant.name);
        System.out.println("Notes: " + Arrays.toString(etudiant.notes));
        System.out.println("Note la plus haute: " + etudiant.plusHaute());
        System.out.println("Note la plus basse: " + etudiant.plusBasse());
        System.out.println("Moyenne: " + etudiant.moyenne());
    }
}