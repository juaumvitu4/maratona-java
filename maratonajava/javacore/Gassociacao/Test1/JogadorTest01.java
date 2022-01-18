package academy.devdojo.maratonajava.javacore.Gassociacao.Test1;

import academy.devdojo.maratonajava.javacore.Gassociacao.Domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.Domain.Time01;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cristiano");
        Jogador jogador2 = new Jogador("Pele");
        Jogador[] jogadores = {jogador, jogador2};
        Time01 time01 = new Time01("Argentina");

        jogador.setTime01(time01);
        jogador2.setTime01(time01);
        time01.setJogadores(jogadores);

        System.out.println("####### Jogadores ########");
        jogador.imprime();




        System.out.println("######### Time ############");
        time01.imprime();
    }
}