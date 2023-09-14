public class SynchronizationExercice {
    public static void main(String[] args) {
        Banque banque = new Banque(200);

        Thread thread1 = new Thread(() -> banque.retire(50));
        Thread thread2 = new Thread(() -> banque.retire(50));

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