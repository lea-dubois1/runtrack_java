public class VoitureExercice {
    public static void main(String[] args) {
        Voiture vroum = new Voiture();

        try {
            System.out.println(vroum.accelere(Integer.parseInt(args[0])));
        }catch(ExceptionVitesse e) {
            System.out.println(e.getMessage());
        }
    }
}