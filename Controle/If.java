package Controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        //boolean criterioAprovacaoAtingido = media <= 10.0 && media >= 7.0
        if (media <= 10.0 && media >= 7.0) { // if (criterioAprovacaoAtingido) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!!");
        }

        boolean criterioRecuperacaoAtingido = media < 7.0 && media >= 4.5;
        if (criterioRecuperacaoAtingido)
            System.out.println("Recuperação!");

        boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;
        if (criterioReprovacaoAtingido)
            System.out.println("Reprovado!");

        entrada.close();
    }
}
/*
Executar mais de uma sentença do if, o ideal é que esteja dentro de um bloco {
}
Se queremos executar de forma condicional apenas uma sentença não precisamos ter um bloco associado, porém
não há problema também se utilizarmos.
 */