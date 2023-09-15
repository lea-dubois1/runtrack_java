import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>(Arrays.asList(args));

        for (String elem : liste) {
            System.out.println(elem);
        }
    }
}