package user;

public class Message {
    private int charCounter;
    private String message;
    private String creationDate;

    public Message(String message) {
        this.message = message;
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
}
