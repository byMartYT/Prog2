public class Main {
    public static void main(String[] args) {
        AutoMessager am = new AutoMessager("test");
        am.start();
        Thread yang = new Yang();
        yang.start();
        Thread anonym = new Thread() {
            @Override
            public void run(){
                while (true) {
                    System.out.println("anonym");
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        anonym.start();
        AutoMessagerInterface ami = new AutoMessagerInterface();
        Thread amiT = new Thread(ami);
        amiT.start();
        while (true) {
            System.out.println("Yin");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static class Yang extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("yang");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}