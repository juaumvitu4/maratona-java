package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominioo.PessoaD;

public class PessoaDTest {
    public static void main(String[] args) {
        PessoaD pessoaD = new PessoaD();
        pessoaD.setIdade(52);
        pessoaD.setNome("Jiraya");
        /// pessoaD.imprime();
        System.out.println(pessoaD.getNome());
        System.out.println(pessoaD.getIdade());


    }
}
