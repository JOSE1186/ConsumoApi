package servico;

import java.net.*;
import java.io.*;
import com.google.gson.*;
import modelo.Coordenadas;

public class ServicoCoordenadas {


    public String nomeCidade;


    public Coordenadas buscarCoordenadas() throws Exception {

        // Usa a variável pública diretamente
        String cidadeCodificada = URLEncoder.encode(nomeCidade, "UTF-8");
        String endereco = "https://geocoding-api.open-meteo.com/v1/search?name=" + cidadeCodificada + "&count=1";

        URL url = new URL(endereco);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");
        conexao.setRequestProperty("User-Agent", "Mozilla/5.0");

        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        String resposta = leitor.readLine();
        leitor.close();

        JsonObject json = JsonParser.parseString(resposta).getAsJsonObject();
        JsonArray resultados = json.getAsJsonArray("results");
        JsonObject resultado = resultados.get(0).getAsJsonObject();

        String cidade = resultado.get("name").getAsString();
        String estado = resultado.has("admin1") ? resultado.get("admin1").getAsString() : "N/D";
        String pais = resultado.get("country").getAsString();
        double latitude = resultado.get("latitude").getAsDouble();
        double longitude = resultado.get("longitude").getAsDouble();

        return new Coordenadas(cidade, estado, pais, latitude, longitude);
    }
}
