package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Players {
    private String name;

    public void print(){
        System.out.println(this.name);
    }
    public Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
