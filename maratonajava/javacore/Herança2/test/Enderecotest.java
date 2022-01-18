package academy.devdojo.maratonajava.javacore.Herança2.test;

import academy.devdojo.maratonajava.javacore.Herança2.Domain.Endereco;
import academy.devdojo.maratonajava.javacore.Herança2.Domain.Pessoa;

public class Enderecotest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep(" cep : 58408-024");
        endereco.setRua("Rua 3");
        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco(endereco);
        pessoa.setCpf("11417780451");
        pessoa.setNome("Tobirama");
        pessoa.imprime();

    }
}
