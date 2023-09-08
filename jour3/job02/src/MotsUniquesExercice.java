import java.util.ArrayList;
import java.util.Collections;

public class MotsUniquesExercice {
    public static void main(String[] args) {
        String output = "Mots uniques: ";
        ArrayList<String> liste = new ArrayList<>();

        for (String mot : args) {
            liste.add(mot);
        }

        for (String word : liste) {
            int frequence = Collections.frequency(liste, word);

            if (frequence == 1) output += word + ", ";
        }
        System.out.println(output.substring(0, output.length() -2));
    }
}