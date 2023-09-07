public class Calcul {
    public double division(int num1, int num2) throws ExceptionByZero {
        if(num2 == 0) {
            throw new ExceptionByZero();
        }
        return (double)num1 / (double)num2;
    }
}
