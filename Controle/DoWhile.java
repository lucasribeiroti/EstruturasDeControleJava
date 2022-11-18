package Controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        /*

        if(expressao booleana) sentença ; ou {} bloco de códigos associado.
        while(expressao booleana) sentença ; ou {} bloco de códigos associado.
        for (...; ...; ...) sentença ; ou {} bloco de códigos associado.

        do {} while(expressao); -> é a única estrutura de controle que termina com ;
        As outras estruturas de controle tem ; associado a sentença de código e não a
        própria estrurura de controle.

         */
        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.print("Você precisa digitar 'sim por favor' para sair... deseja sair: ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("sim por favor"));
        System.out.println("Obrigado!");

        entrada.close();
    }
}

/*
Estrutura do while é executada pelomenos uma vez, enquanto o while pode ser executado nenhuma ou várias vezes.
 */