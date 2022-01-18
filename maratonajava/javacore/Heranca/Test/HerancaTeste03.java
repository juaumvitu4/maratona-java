package academy.devdojo.maratonajava.javacore.Heranca.Test;

import academy.devdojo.maratonajava.javacore.Heranca.Domain.Funcionario;

public class HerancaTeste03 {

    // 0 - bloco de inicialização estaticco da super classe é executado quando a jvm carregar a pai
    // 1 - bloco de inicialização estaticco da sub classe é executado quando a jvm carregar a filha
    // 2 - alocado espaço em memoria pro objeto superclasse
    // 3 - cada atributo de superclasse é criado e inicializado com valores default ou o quer for passado
    // 4 - bloco de inicizalição da super classe é executado na ordem em que aparece
    // 5 - construtor e executado da super classe
    // 6 - alocado espaco em memoria pro objeto da subclasse
    // 7 - cada atributo de subclasse e criado e inicializado com valores default ou quer for passado da classe
    // 8 - bloco de inicializacao da subclasse e executado na ordem em que aparece
    // 9 - construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
