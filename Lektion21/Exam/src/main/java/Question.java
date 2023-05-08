public class Question {
    String text;
    public static Question toQuestion(String line) {
        return new Question(line);
    }

    public Question(String text) {
        this.text = text;
    }
}
