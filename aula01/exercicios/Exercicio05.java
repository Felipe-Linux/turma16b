package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double custoFabrica, custoDistribuidor, impostos, somaFinal;

        System.out.println("Entre com o custo de Fabrica: ");
        custoFabrica = entrada.nextDouble();

        custoDistribuidor = 0.28 * custoFabrica;
        impostos = 0.45 * custoFabrica;

        somaFinal = custoFabrica + custoDistribuidor + impostos;

        System.out.println("Custo final do carro: " + somaFinal);
        System.out.println("Imposto pago no carro: " + impostos);

        entrada.close();





    }
    
}
