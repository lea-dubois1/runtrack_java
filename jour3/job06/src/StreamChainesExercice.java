import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamChainesExercice {
    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>(Arrays.asList(args));

        ArrayList<String> output = liste.stream()
                                        .filter(str -> str.length() == 3)
                                        .filter(str -> str.charAt(0) == 'a')
                                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(output);
    }
}