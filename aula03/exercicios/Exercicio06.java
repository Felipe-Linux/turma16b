package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, imparPercent, numero, somaPar, pares, QTDE_NUMEROS;

        imparPercent = 0;
        somaPar = 0;
        pares = 0;
        QTDE_NUMEROS = 10;

        for (cont = 1; cont <= QTDE_NUMEROS; cont++) {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                pares++;
                somaPar = somaPar + numero;

            }

        }
        System.out.println("Média dos valores pares: " + ((double) somaPar / pares));
        System.out.println(
                "A porcentagem dos valores impares: " + ((double) (QTDE_NUMEROS - pares) / QTDE_NUMEROS) * 100 + "%");
        entrada.close();

    }

}
