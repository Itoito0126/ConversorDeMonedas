import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {

    //Mediante la clase API estoy obteniendo la información proveniente del enlace
    //Me devuelve un objeto de la clase APIConversionRates, es decir, solo extrae el conversion_rates del API
    public APIConversionRates ReadAPI() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/3c5fa20eeea7b9afb1f9fe6d/latest/USD")).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        return gson.fromJson(response.body(), APIConversionRates.class);
    }
}
