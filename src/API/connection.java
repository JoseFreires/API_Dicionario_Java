package API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class connection {
    public String connectAPI(String url){
        try{
            URI endereco = URI.create(url); 
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request= HttpRequest.newBuilder(endereco).GET().build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String body = response.body();
            return body;

        } catch (IOException | InterruptedException ex){
            throw new RuntimeException(ex);
        }

    }
}
