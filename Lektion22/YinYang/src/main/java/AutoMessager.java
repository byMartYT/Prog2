public class AutoMessager extends Thread {

    String message;

    public AutoMessager(String message){
        this.message = message;
    }
    @Override
    public void run() {
        while(true){
            System.out.println(message);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}