package Controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota de 0 a 10: ");
        double nota = entrada.nextDouble();

        boolean notaInvalida = nota < 0.0 || nota > 10.0;
        boolean conceitoA = nota >= 8.0 && nota <= 10.0;
        boolean conceitoB = nota > 6.0 && nota < 8.0;
        boolean conceitoC = nota >= 4.0 && nota <= 6.0;

        if (notaInvalida) {
            System.out.println("Conceito inválido!");
        }else if (conceitoA) {
            System.out.println("Seu conceito é A!");
        }else if (conceitoB) {
            System.out.println("Seu conceito é B!");
        }else if (conceitoC) {
            System.out.println("Seu conceito é C!");
        }else {
            System.out.println("Seu conceito é D!");
        }
        System.out.println("Fim!");
        entrada.close();
    }
}