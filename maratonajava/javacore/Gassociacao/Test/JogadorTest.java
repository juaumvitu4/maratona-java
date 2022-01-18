package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cristiano");
        Jogador jogador2 = new Jogador("Junior");
        Time time = new Time("Suecia");
        Jogador[] jogadores = {jogador, jogador2};


        time.setJogadores(jogadores);

        System.out.println("------------- jogador---------");

        jogador.imprime();
        jogador2.imprime();


        System.out.println("------------- time ---------");

        time.imprime();
    }
}
