package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Teacher {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Teacher(String nome) {
        this.nome = nome;
    }

    public Teacher(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("###########");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("## Seminarios Cadastrados ## ");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) return;
            System.out.println("** alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("aluno : " + aluno.getNome() + "\nIdade " + aluno.getIdade());

            }

        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Teacher(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
