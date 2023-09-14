public class LockExercice {
    public static void main(String[] args) {
        Banque banque = new Banque(Integer.parseInt(args[0]));

        Thread thread1 = new Thread(() -> banque.retire(Integer.parseInt(args[1])));
        Thread thread2 = new Thread(() -> banque.retire(Integer.parseInt(args[1])));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        banque.display();
    }
}