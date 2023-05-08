import java.io.Serializable;
import java.util.ArrayList;

public class ServerResponse implements Serializable {
    String response;
    int failCount;
    String wrongChars;
    String rightChars;
    boolean printStats;
    boolean playing;
    String word;

    public ServerResponse(String response, int failCount, ArrayList<Character> wrongChars, ArrayList<Character> rightChars, String word, boolean playing, boolean printStats) {
        this.response = response;
        this.failCount = failCount;
        StringBuilder wc = new StringBuilder();
        for (int i = 0; i < wrongChars.size(); i++) {
            if (i != 0) wc.append(", ");
            wc.append(wrongChars.get(i));
        }
        this.wrongChars = wc.toString();
        StringBuilder rc = new StringBuilder();
        for (int i = 0; i < rightChars.size(); i++) {
            if (i != 0) rc.append(", ");
            rc.append(rightChars.get(i));
        }
        this.rightChars = rc.toString();
        this.word = word;
        this.playing = playing;
        this.printStats = printStats;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Response: ").append(response).append("\n");
        res.append("Fails: ").append(failCount).append("\n");
        res.append("Wrong Chars: ").append(wrongChars).append("\n");
        res.append("Right Chars: ").append(rightChars).append("\n");
        res.append("Word: ").append(word).append("\n");
        res.append("Playing: ").append(playing).append("\n");
        res.append("PrintStats: ").append(printStats).append("\n");
        return res.toString();
    }
}
