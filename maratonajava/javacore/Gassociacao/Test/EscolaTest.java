package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi");
        Professor professor2 = new Professor("Jiraya");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Premen");
        escola.imprime();


    }
}
