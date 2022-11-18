package Controle;

public class While1 {

    public static void main(String[] args) {
        //while determinado
        int contador = 1;

        while(contador <= 10) {
            System.out.printf("i = %d\n", contador);
            contador ++; // contador += 2 -> contando de 2 em 2
        }
    }
}
