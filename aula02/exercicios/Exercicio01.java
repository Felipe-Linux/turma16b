package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, calculo;

        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();

        if (numero >= 0) {
            //calculo = numero / 2;
            System.out.println("Número é positivo");

        } else {
            System.out.println("Número é negativo");

        }

        teclado.close();
    }
    
}
