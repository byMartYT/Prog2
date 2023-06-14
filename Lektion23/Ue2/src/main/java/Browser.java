import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.fail;


public class Browser {
    public Optional<URL> back() {
        try {
            //simulate: fetch last URL from Stack
            URL url = Math.random() < 0.5 ? new URL("http://google.de") : null;
            return Optional.ofNullable(url);
        } catch (MalformedURLException e) {
            return Optional.empty();
        }
    }


    @Test
    public void testNotNull(){
        Browser b = new Browser();
        Optional<URL> back = b.back();
        try {
            back.ifPresent(b::retrieveSite);
        } catch (NullPointerException e) {
            fail("NPE");
        }
    }

    public String retrieveSite(URL url) {
        //simulate download site:
        return url.toString();
    }

    public static void main(String[] args) {
        System.out.println("Normal back");
        Browser browser = new Browser();
        Optional<URL> back = browser.back();
        back.ifPresent(browser::retrieveSite);
    }
}