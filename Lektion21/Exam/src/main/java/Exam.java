import java.io.*;
import java.util.ArrayList;

public class Exam {
    ArrayList<Question> questions = new ArrayList<>();
    //Liest den Tex-Header aus einer Datei u. gibt ihn als String zurück
    public String readHeaderFromFile() {
        return null;
    }

    public void readQuestions() throws IOException {
        try (Reader r = new FileReader("questions.csv");
             BufferedReader br = new BufferedReader(r);
        ){
            String line;
            while ((line = br.readLine()) != null) {
                questions.add(Question.toQuestion(line));
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public void toTest() throws IOException {

        try (Writer r = new FileWriter("test.tex");
            BufferedWriter br = new BufferedWriter(r)) {
            //br.write(readHeaderFromFile());
            br.write("\\begin{document}\n");

            for(Question q : questions) {
                br.write("\\textbf{" + q.text + "?}\\\\\n");
            }

            br.write("\\end{document}\n");
            br.flush();
        } catch (IOException e) {
            throw new IOException(e);
        }

    }

}