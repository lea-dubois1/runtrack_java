public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                System.out.println("Salut du thread!");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
