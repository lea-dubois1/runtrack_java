import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsOperationExercice {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();

        for (String num : args) {
            liste.add(Integer.parseInt(num));
        }

        ArrayList<Integer> toOutput = liste.stream()
                                        .map(n -> n *= 2)
                                        .filter(n -> n > 10)
                                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(toOutput);
    }
}