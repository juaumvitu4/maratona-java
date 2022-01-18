package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Animesx {
    private String nome;
    private int[] episodios;
    // 1 - alocado espaco em memoria pro objeto
    // 2 - cada atributo de classe é criado e inicializado com valores defalt ou o que for passada
    // 3 - bloco de inicializacao é executado
    // 4 - construtor é executado
    {
        System.out.println("Espaco alocado em memoria");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }

    }

    public Animesx(String nome) {
        this.nome = nome;
    }

    public Animesx() {
        for (int episodios : this.episodios) ;
        System.out.println(episodios + " ");
    }



    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
