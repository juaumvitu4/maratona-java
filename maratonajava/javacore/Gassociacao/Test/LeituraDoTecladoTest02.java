package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" O Grande Software de previsão do futuro ");
        System.out.println("Digite sua pergunnta e eu responderei sim ou nao");
        String pergunta = input.nextLine();

        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }

    }

}
