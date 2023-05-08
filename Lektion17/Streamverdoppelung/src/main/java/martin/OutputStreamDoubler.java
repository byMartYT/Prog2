package martin;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler {

    OutputStream[] os;

    public OutputStreamDoubler(OutputStream os1, OutputStream os2) {
        this.os = new OutputStream[]{os1, os2};
    }


    public void write(int b) {
        for (OutputStream o : os) {
            try {
                o.write(String.valueOf(b).getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void close() throws IOException {
        int flag = 0;
        for (int i = 0; i < os.length; i++) {
            try {
                os[i].close();
            } catch (IOException e) {
                flag += i;
            }
        }

        if (flag != 0) {
            throw new IOException(switch (flag) {
                case 1, 2 -> "Stream " + flag + "konnte nicht geschlossen werden!";
                case 3 -> "Beide Streams konnten nicht geschlossen werden";
                default -> "Unbekannter Fehler";
            });
        }
    }
}
