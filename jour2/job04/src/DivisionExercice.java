public class DivisionExercice {
    public static void main(String[] args) {
        Calcul calcul = new Calcul();

        try {
            System.out.println(calcul.division(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        }catch(ExceptionByZero e) {
            System.out.println(e.getMessage());
        }
    }
}