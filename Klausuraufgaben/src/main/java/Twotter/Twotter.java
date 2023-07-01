package Twotter;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Twotter {
    public static void main(String[] args) throws MalformedURLException {
        TwotterSystem sys = new TwotterSystem();
        User u = new User("martin", "NoahEsReichtJetztWirklichMitAbschreiben!");
        sys.addMessage(u, new Message("Moin Moin"));
        List<Message> a = sys.getAllMessages();

        //Download Manager
        DownloadManager manager = new DownloadManager();
        String jobID = manager.configure(4, 4000).specifyDownloadLocation(new URL("http://iunua.de")).startDownload();
        System.out.println(jobID);
    }


}
