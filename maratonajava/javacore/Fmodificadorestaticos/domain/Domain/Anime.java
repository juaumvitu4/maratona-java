package academy.devdojo.maratonajava.javacore.Fmodificadorestaticos.domain.Domain;

import javax.crypto.spec.PSource;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 1 - bloco de inicialização é executado quando a jvm carregar a classe
    // 2 - alocado espaço em memoria pro projeto
    // 3 - cada atributo de classe é criado e inicializado comm valores default ou o quer
    // 4 - bloco de inicizalição é executado
    // 5 - construtor é executado
        static {
            System.out.println("Dentro do bloco do inicializador estatico");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
        static{
            System.out.println("Dentro do bloco do inicializador estatico 2");
        }


    public Anime(String nome) {
        this.nome = nome;
    }

    static {
        System.out.println("Dentro do bloco do inicializador 3");
    }
    {
        System.out.println("Dentro do bloco do inicializador não estatico");
    }


    public Anime() {
        for(int episodios: Anime.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
