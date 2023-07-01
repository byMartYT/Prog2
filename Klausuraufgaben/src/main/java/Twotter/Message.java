package Twotter;

import java.time.LocalDate;
import java.util.Date;

public class Message {
    private int charCounter;
    private String message;
    private String creationDate;

    public Message(String message) {
        this.message = message;
        this.charCounter = message.toCharArray().length;
        this.creationDate = LocalDate.now().toString();
    }

    public int getCharCounter() {
        return charCounter;
    }

    public void setCharCounter(int charCounter) {
        this.charCounter = charCounter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString(){
        return message;
    }
}
