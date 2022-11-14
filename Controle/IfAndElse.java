package Controle;

import java.util.Scanner;

public class IfAndElse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        if (media > 10) {
            System.out.println("Média inválida!");
        }else if (media < 0) {
            System.out.println("Média inválida!");
        }else if (media >= 7){
            System.out.println("Você está de aprovado!");
        }else if (media <= 4){
            System.out.println("Você está reprovado!");
        }else{
            System.out.println("Você está de recuperação! ");
        }

        entrada.close();
    }
}