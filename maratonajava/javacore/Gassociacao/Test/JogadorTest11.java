package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest11 {
    public static void main(String[] args) {
        Jogador player1 = new Jogador("Cristiano");
        Jogador player2 = new Jogador("Romario");
        Jogador player3 = new Jogador("Cafu");
        Jogador[] players = new Jogador[] {player1, player2, player3};
        for (Jogador player : players) {
            player.imprime();
        }

    }
}
