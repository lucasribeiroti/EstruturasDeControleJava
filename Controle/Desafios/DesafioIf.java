package Controle.Desafios;

import java.util.Scanner;

public class DesafioIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da nota: ");
        double nota = entrada.nextDouble();

        boolean quadroDeHonra = nota >= 9;

        if (quadroDeHonra);{ // com esse ; será impresso "Quadro de honra!" e "Você é fera!" de qualquer forma.
            System.out.println("Quadro de honra!");
            System.out.println("Você é fera!");
        }
        entrada.close();
    }
}
/*
Não terminamos o bloco if com ; pois dessa forma sempre será impresso os System.out.println abaixo,
independente se a condição for verdadeira ou falsa. Não usar ; em estrutura de controle (tem uma exceção).
 */