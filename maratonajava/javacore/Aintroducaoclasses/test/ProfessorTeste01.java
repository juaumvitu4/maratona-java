package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Girafares";
        professor.idade = 26;
        professor.sexo = 'M';
        System.out.print("Nome : "+professor.nome +  "\nIdade : "+ professor.idade + "\nSexo : " +professor.sexo);

    }
}
