import java.io.Serializable;

public class ClientGuess implements Serializable {

    char guess;

    public ClientGuess(char guess) {
        this.guess = Character.toUpperCase(guess);
    }
}
