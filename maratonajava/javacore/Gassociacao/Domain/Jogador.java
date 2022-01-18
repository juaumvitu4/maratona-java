package academy.devdojo.maratonajava.javacore.Gassociacao.Domain;

public class Jogador {
    private String nome;
    private Time01 time01;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time01 time) {
        this.nome = nome;
        this.time01 = time;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (time01 != null) {
            System.out.println(time01.getNome());

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time01 getTime01() {
        return time01;
    }

    public void setTime01(Time01 time01) {
        this.time01 = time01;
    }


}

