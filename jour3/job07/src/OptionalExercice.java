import java.util.Optional;

public class OptionalExercice {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Chaîne non fournie"));
    }
}