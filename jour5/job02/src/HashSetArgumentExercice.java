import java.util.Arrays;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.stream(args).distinct().toArray()));
    }
}