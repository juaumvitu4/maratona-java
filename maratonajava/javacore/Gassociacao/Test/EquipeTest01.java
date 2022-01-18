package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class EquipeTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano");
        Time time = new Time("Brasil");
        jogador1.imprime();
        jogador1.setTime(time);

    }
}
