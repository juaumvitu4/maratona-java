package academy.devdojo.maratonajava.javacore.Heranca.Domain;

public class Pessoa1 {
    private String nome;
    private String cpf;
    private Endereco1 endereco1;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco1.getRua() + " " + this.endereco1.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco1 getEndereco1() {
        return endereco1;
    }

    public void setEndereco1(Endereco1 endereco1) {
        this.endereco1 = endereco1;
    }
}



