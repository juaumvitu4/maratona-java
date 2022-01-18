package academy.devdojo.maratonajava.javacore.Heranca.Test;

import academy.devdojo.maratonajava.javacore.Heranca.Domain.Endereco1;
import academy.devdojo.maratonajava.javacore.Heranca.Domain.Funcionario1;
import academy.devdojo.maratonajava.javacore.Heranca.Domain.Pessoa1;

public class HerancaTest02 {
    public static void main(String[] args) {
        Endereco1 endereco1 = new Endereco1();
        endereco1.setRua("Rua 4");
        endereco1.setCep("58408-014");
        Pessoa1 pessoa1 = new Pessoa1();
        pessoa1.setCpf("11780452");
        pessoa1.setNome("Luffy");
        pessoa1.setEndereco1(endereco1);

        pessoa1.imprime();

        Funcionario1 funcionario1 = new Funcionario1();
        funcionario1.setNome("Funcionario 15");
        funcionario1.setEndereco1(endereco1);
        funcionario1.setCpf("117155896-35");
        funcionario1.setSalario(2560);
        System.out.println("#########");
        funcionario1.imprime();
    }

}
