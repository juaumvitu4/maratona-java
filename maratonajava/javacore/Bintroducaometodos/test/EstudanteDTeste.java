package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominioo.EstudanteD;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominioo.ImpressoraEstudanteD;

public class EstudanteDTeste {
    public static void main(String[] args) {
        EstudanteD estudanteD01 = new EstudanteD();
        EstudanteD estudanteD02 = new EstudanteD();

        ImpressoraEstudanteD impressora = new ImpressoraEstudanteD();

        estudanteD01.nome = "Zoro";
        estudanteD01.idade = 26;
        estudanteD01.sexo = 'M';

        estudanteD02.nome = "Luffy";
        estudanteD02.idade = 23;
        estudanteD02.sexo = 'M';

        ImpressoraEstudanteD.imprime(estudanteD01);
        ImpressoraEstudanteD.imprime(estudanteD02);


    }
}
