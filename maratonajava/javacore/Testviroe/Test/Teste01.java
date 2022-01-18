package academy.devdojo.maratonajava.javacore.Testviroe.Test;

import academy.devdojo.maratonajava.javacore.Testviroe.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Testviroe.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Testviroe.Dominio.Pessoa;

public class Teste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("58408-014");
        endereco.setRua("Rua 4");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("NOME : Joao ");
        pessoa.setCpf("CPF : 159.156.168-156");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario();
        System.out.println("######################");
        funcionario.setNome("Nome : jiraya");
        funcionario.setCpf("CPF : 156.168.152-84");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1.125);
        funcionario.imprime();

    }
}
