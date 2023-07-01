package Twotter;

import java.net.URL;
import java.util.UUID;

public class DownloadJob extends Thread{
    private URL url;
    private byte[] data;
    private String jobID = UUID.randomUUID().toString();

    public DownloadJob(URL url) {
        this.url = url;
    }

    @Override
    public void run(){
        data = DownloadManager.downloadFromURL(url);
    }

    public byte[] getData() {
        return data;
    }

    public String getJobID() {
        return jobID;
    }
}
