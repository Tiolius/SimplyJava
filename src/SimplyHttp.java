import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SimplyHttp {
    public static void main(String[] args) throws java.net.URISyntaxException, IOException, InterruptedException {
        /*HttpClient client = HttpClient.newBuilder()
                .proxy(ProxySelector
                        .of(new InetSocketAddress("hqproxy.avp.ru", 8080))).build();*/

        String uri = "https://api.thecatapi.com/v1/images/search";
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI(uri))
                .header("accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        /*client.send(request, HttpResponse.BodyHandlers.ofString());*/

        System.out.println(response);
        System.out.println(response.body());
    }


}