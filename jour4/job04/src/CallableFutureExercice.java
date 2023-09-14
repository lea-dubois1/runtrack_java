import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExercice {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> multiply = new Multiplier(5,6);
        Future<Integer> future = executor.submit(multiply);

        try {
            int result = future.get();
            System.out.println("Résultat de la multiplication: " + result);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        executor.shutdown();
    }
}