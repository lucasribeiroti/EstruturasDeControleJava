package Controle.Desafios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtdeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota ou digite -1 para sair: ");
            nota = entrada.nextDouble();
            if (nota > 0 && nota < 10){
                total += nota;
                qtdeNotas ++;
            } else if (nota != -1) {
                System.out.println("Nota invalida!");
            }
        }
        double media = total / qtdeNotas;
        System.out.println("Media: " + media);

        entrada.close();
    }
}