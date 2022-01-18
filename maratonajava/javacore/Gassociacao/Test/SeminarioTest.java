package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Teacher;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno alunos = new Aluno("João", 18);
        Teacher teacher = new Teacher("Barba Branca", "pirata");
        Aluno[] alunosParaSeminario = {alunos};

        Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        teacher.setSeminarios(seminariosDisponiveis);

        teacher.imprime();

    }
}
