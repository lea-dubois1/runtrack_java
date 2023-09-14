import java.util.concurrent.Callable;

public class Multiplier implements Callable<Integer> {
    private int num1;
    private int num2;
    public Multiplier(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }
    @Override
    public Integer call() throws Exception {
        return num1 * num2;
    }
}