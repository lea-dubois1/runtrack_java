import java.util.concurrent.*;

public class ThreadInterruptionExercice {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> thread = new MyThread(Integer.parseInt(args[0]));
        Future<Integer> future = executor.submit(thread);

        try {
            future.get(Integer.parseInt(args[0]) / 2, TimeUnit.SECONDS);
        }catch (TimeoutException e) {
            System.out.println("Thread interrompu après " + Integer.parseInt(args[0]) / 2 + " secondes!");
            future.cancel(true);
        }

        executor.shutdown();
    }
}