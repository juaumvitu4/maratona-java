package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Players;

public class PlayerTest00 {
    public static void main(String[] args) {
        Players player1 = new Players("Cristiano");
        Players player3 = new Players("Messi");
        Players player2 = new Players("Neymar");
        Players[] players = new Players[]{player1, player2, player3};
        for (Players player : players) {
            player.print();
        }


    }
}
