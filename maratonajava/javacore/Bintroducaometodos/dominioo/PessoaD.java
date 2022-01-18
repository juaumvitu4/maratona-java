package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominioo;

public class PessoaD {
    private String nome1 ;
    private int idade1 ;

    public void imprime (){
        System.out.println(this.nome1);
        System.out.println(this.idade1);
    }

    public void setNome(String nome1){
        this.nome1 = nome1;

    }

    public void setIdade(int idade1){
        if (idade1 < 0 ){
            System.out.println("Idade Invalida");
            return;
        }
        this.idade1 = idade1;
    }
    public String getNome(){
        return this.nome1;

    }
    public int getIdade(){
        return this.idade1;
    }

}
