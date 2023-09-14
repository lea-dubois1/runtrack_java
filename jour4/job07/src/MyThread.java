import java.util.concurrent.Callable;

public class MyThread implements Callable<Integer> {
    private int seconds;
    public MyThread(int sec) {
        this.seconds = sec * 1000;
    }
    @Override
    public Integer call() throws Exception {

        try {
            Thread.sleep(this.seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
