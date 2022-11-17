package Controle;

import javax.swing.*;

public class IfAndElse {

    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("Esse número é par!");
        }else{
            System.out.println("Esse número é impar!");
        }

        /*
        if (numero % 2 == 0) -> com ou sem chaves
            System.out.println("Esse número é par!");
        else -> com ou sem chaves
            System.out.println("Esse número é ímpar!");
         */
    }
}