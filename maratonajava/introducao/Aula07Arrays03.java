package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nome = new String[4];
        nome [0] = "Goke";
        nome [1] = "Kurosaki";
        nome [2] = "Luffy";
        nome [3] = "Tralfagaw";

        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);

        }
    }
}
