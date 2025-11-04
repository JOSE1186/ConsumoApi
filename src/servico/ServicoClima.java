package servico;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import modelo.Clima;
import modelo.Coordenadas;

public class ServicoClima {


    public Clima buscarClima(Coordenadas coordenadas) throws Exception {

        String endereco = "https://api.open-meteo.com/v1/forecast?latitude="
                + coordenadas.getLatitude() + "&longitude=" + coordenadas.getLongitude() + "&current=temperature_2m";

        URL url = new URL(endereco);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");
        conexao.setRequestProperty("User-Agent", "Mozilla/5.0");

        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        String resposta = leitor.readLine();
        leitor.close();

        JsonObject json = JsonParser.parseString(resposta).getAsJsonObject();
        JsonObject current = json.getAsJsonObject("current");

        double temperatura = current.get("temperature_2m").getAsDouble();


        return new Clima(coordenadas, temperatura);
    }
}
