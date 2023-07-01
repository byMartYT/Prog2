package Twotter;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DownloadManager {

    private URL url;

    // e. um mehrere Download verwalten zu können. Müssen wir eine die Methode startDownload
    // überladen mit public Map<JobID, Twotter.DownloadJob> startDownload(List<URL> l) {...}


    DownloadManager configure(int maxThreads, long timeout) {
        System.out.println("Configured");
        return this;
    }


    String startDownload() {
        System.out.println("Download started");
        DownloadJob dj = new DownloadJob(url);
        Thread t = new Thread(dj);
        t.start();
        return dj.getJobID();
    }

    Map<String, DownloadJob> startDownload(List<URL> l) {
        return new HashMap<>();
    }


    void cancelDownload(String jobId) {

    }

    DownloadManager specifyDownloadLocation(URL url) {
        System.out.println(url);
        this.url = url;
        return this;
    }

    public static byte[] downloadFromURL( URL url) {
        return new byte[4];
    }
}
