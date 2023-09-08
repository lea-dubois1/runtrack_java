import java.util.HashMap;
import java.util.Map;

public class EtudiantsMapExercice {
    public static void main(String[] args) {
        Map<Integer, String> etudiants = new HashMap<>();
        etudiants.put(101, "Pierre");
        etudiants.put(102, "Marie");
        etudiants.put(103, "Jean");

        for (int i = 101; i < etudiants.size() + 101; i++) {
            System.out.println(i + ": " + etudiants.get(i));
        }
    }
}