package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class AnimeD {
    private String nome;
    private int episodio;
    private String genero;
    private String tipo;

    public AnimeD(){

    }
    public void init(String nome, String tipo, int episodio, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;

    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
