package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        //se a idade for menor que 15, imprima na tela categoria infatil
        // se a idade for menor que 18, imprima na tela ccategoria juvenil
        // se a idade for maior que 18, imprima na tela categoria adulto
        int idade = 100000;
        String categoria;
        if (idade <= 15) {
            categoria = "Categoria infatil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
