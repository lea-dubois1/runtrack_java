public class GenericsExercice {
    public static void main(String[] args) {
        Boite<String> box = new Boite();
        box.ajout(args[0]);
        box.suppr();
    }
}