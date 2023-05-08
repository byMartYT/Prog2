import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Main {
    public static void main(String[] args) {
        Response  res = ClientBuilder.newClient().target("https://jsonplaceholder.typicode.com/posts/1").request(MediaType.APPLICATION_JSON).get();
        String s = res.readEntity(String.class);
        System.out.println(s);
    }
}
