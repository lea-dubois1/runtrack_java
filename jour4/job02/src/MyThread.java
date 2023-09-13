public class MyThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("En cours d'exécution...");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
