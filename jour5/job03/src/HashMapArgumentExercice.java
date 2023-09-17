import java.util.Arrays;
import java.util.HashMap;

public class HashMapArgumentExercice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < args.length; i+=2) {
            map.put(args[i], args[i+1]);
        }
        for (String elem : map.keySet()) {
            System.out.println(elem + ": " + map.get(elem));
        }
    }
}