package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominioo.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Todoroki";
        estudante02.idade = 17;
        estudante02.sexo = 'M';

        estudante01.imprime();
        System.out.println("#############");
        estudante02.imprime();
    }
}
