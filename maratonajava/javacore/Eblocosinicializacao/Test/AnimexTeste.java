package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.Test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Animesx;

public class AnimexTeste {
    public static void main(String[] args) {
        Animesx animesx = new Animesx("One Piece");
        for (int episodio : animesx.getEpisodios()) {
            System.out.println(episodio + " ");
        }


    }
}
