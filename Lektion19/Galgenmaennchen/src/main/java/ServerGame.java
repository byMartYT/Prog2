import java.util.ArrayList;

public class ServerGame {
    int fails = 0;

    ArrayList<Character> typedChars = new ArrayList<>();
    ArrayList<Character> rightChars = new ArrayList<>();
    ArrayList<Character> wrongChars = new ArrayList<>();
    ArrayList<Character> leftChars = new ArrayList<>();

    boolean playing;

    String word;
    final String[] words = {"PROGRAMMIERSPRACHEN", "Kirschkern", "Weitspuckwettbewerb", "Lokomotiv", "Metapher", "einpackpapier", "lebenszyklus", "druckventil"};

    public void generate() {
        System.out.println("Generating New Game");
        // Reset stats
        fails = 0;
        playing = true;
        typedChars.clear();
        wrongChars.clear();
        leftChars.clear();
        rightChars.clear();

        //Choose Random word
        word = words[(int) (Math.random() * words.length)].toUpperCase();

        for (char c : word.toCharArray()) {
            c = Character.toUpperCase(c);
            if (!leftChars.contains(c)) {
                leftChars.add(Character.toUpperCase(c));
            }
        }
    }

    public ServerResponse input(char c) {
        if(c == '#') {
            generate();
            return createResponse(null, true);
        }
        if(!Character.isLetter(c)) return createResponse("Bitte einen Buchstaben eingeben", false);
        if (typedChars.contains(c)) {
            return createResponse("Dieser Buchstabe wurde bereits eingegeben!",  false);
        } else {
            typedChars.add(c);
        }
        if (leftChars.contains(c)) {
            leftChars.remove(Character.valueOf(c));
            rightChars.add(c);
            if(leftChars.size() == 0) {
                playing = false;
                return createResponse("Du hast gewonnen!", true);
            }
            return createResponse("Korrekt",true);
        } else {
            wrongChars.add(c);
            fails++;
            return createResponse("Falsch!", true);
        }
    }

    public String handleWord() {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if(rightChars.contains(word.charAt(i))) {
                response.append(word.charAt(i));
            } else {
                response.append("_");
            }
        }
        System.out.println(response);
        return response.toString();
    }

    public ServerResponse createResponse(String response, boolean printStats) {
        String newWord = handleWord();
        System.out.println(newWord);
        return new ServerResponse(response, fails, wrongChars, rightChars, newWord, playing, printStats);
    }

}
