package alura.screenmatch.modelando;

import alura.screenmatch.excecao.ErroDeConversaoDeAnoExpection;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OmdbService {
    private static final String API_KEY = "fe5df2f2";
    private static final String BASE_URL = "https://www.omdbapi.com/";

    public TituloOmdb consultarTitulo(String nome) throws IOException, InterruptedException, ErroDeConversaoDeAnoExpection {
        String query = nome.trim().replace(" ", "+");
        String uri = String.format("%s?t=%s&apikey=%s", BASE_URL, query, API_KEY);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println("JSON recebido da API: " + json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        return gson.fromJson(json, TituloOmdb.class);
    }
}