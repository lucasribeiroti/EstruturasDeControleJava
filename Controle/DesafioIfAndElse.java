package Controle;

public class DesafioIfAndElse {

    public static void main(String[] args) {
        double nota = 1.3;

        if (nota >= 9.0);{ // com esse ; será impresso "Quadro de honra!" e "Você é fera!" de qualquer forma.
            System.out.println("Quadro de honra!");
            System.out.println("Você é fera!");
        }
    }
}
/*
Não terminamos o bloco if com ; pois dessa forma sempre será impresso os System.out.println abaixo,
independente se a condição for verdadeira ou falsa. Não usar ; em estrutura de controle (tem uma exceção).
 */