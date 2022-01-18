package academy.devdojo.maratonajava.javacore.Heranca.Test;

import academy.devdojo.maratonajava.javacore.Heranca.Domain.Endereco;
import academy.devdojo.maratonajava.javacore.Heranca.Domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Heranca.Domain.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("\nCep : 58408-014");
        Pessoa pessoa = new Pessoa("Joao");
        pessoa.setCpf("CPF: 1595263014");
        pessoa.setEndereco(endereco);

        pessoa.imprime();


        Funcionario funcionario = new Funcionario("Oda noburama");
        funcionario.setCpf("CPF: 117856236-51");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1580);

        System.out.println("########################");


        funcionario.imprime();

    }
}
