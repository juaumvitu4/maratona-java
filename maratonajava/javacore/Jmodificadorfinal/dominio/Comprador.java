package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador  " +
                "\nnome: '" + nome + '\'' +
                ' ';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}