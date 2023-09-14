import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExercice {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++) {
            int num = i;
            executor.submit(() -> System.out.println("Résultat de la tâche " + num + ": " + Integer.parseInt(args[0]) * num));
        }

        executor.shutdown();
    }
}