public class AutoMessagerInterface implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("interface");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
