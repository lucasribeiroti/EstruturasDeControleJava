package Controle;

import java.util.Scanner;

public class IfElseIf2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        boolean criterioAprovacao = media >= 7;
        boolean criterioReprovacao = media <= 4;

        if (media < 0 || media > 10) {
            System.out.println("Média inválida!");
        }else if (criterioAprovacao){
            System.out.println("Você está de aprovado!");
        }else if (criterioReprovacao){
            System.out.println("Você está reprovado!");
        }else{
            System.out.println("Você está de recuperação! ");
        }

        entrada.close();
    }
}