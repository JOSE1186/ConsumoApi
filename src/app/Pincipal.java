package app;

import java.util.Scanner;

import modelo.Clima;
import servico.ServicoClima;
import servico.ServicoCoordenadas;
import modelo.Coordenadas;

public class Pincipal {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da cidade:");
        String nomeCidade = entrada.nextLine();

        ServicoCoordenadas servico = new ServicoCoordenadas();


        servico.nomeCidade = nomeCidade;

        Coordenadas coordenadas = servico.buscarCoordenadas();
        ServicoClima servicoClima = new ServicoClima();


        Clima clima = servicoClima.buscarClima(coordenadas);

        System.out.println(clima);

        entrada.close();
    }
}
