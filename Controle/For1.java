package Controle;

public class For1 {

    public static void main(String[] args) {
        /*
        Exemplo do while anterior:
        int contador = 1;

        while(contador <= 10) {
            System.out.printf("i = %d\n", contador);
            contador ++;
         */

        // Representação com for (estutura focada em repetição determinada)

        for (int contador = 1; contador <= 10; contador ++) {
            System.out.println("Bom dia! - " + contador);
        }
    }
}

/*
Caso em que o while seria mais recomendado:

        int x = 1;
        for (; x <= 10;) {
            System.out.println("x = " + x);
            x ++;

            ou

         for (;true;) ou for (;;) laço infinito
*/