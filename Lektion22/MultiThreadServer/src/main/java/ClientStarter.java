public class ClientStarter {



    public static void main(String[] args) {
        Client c1 = new Client("c1" ,new int[]{5, 7, 13, 53035357, 23493, 93523982, 54545});
        Client c2 = new Client("c2" ,new int[]{51, 73, 131, 530353573, 234932323, 3982});
        c1.start();
        c2.start();
    }
}
