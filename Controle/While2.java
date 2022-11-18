package Controle;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String digitar = "";

        while (!digitar.equalsIgnoreCase("sair")) {
            System.out.print("Digita algo ae: ");
            digitar = entrada.nextLine();
        }
        System.out.println("Ate logo!");

        entrada.close();
    }
}