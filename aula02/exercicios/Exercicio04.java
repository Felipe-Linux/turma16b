package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, valorPrestacao, calculo;

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();
        System.out.println("Digite o valor da prestação");
        valorPrestacao = entrada.nextDouble();

        calculo = salario * 0.3;

        if (valorPrestacao <= calculo){
            System.out.println("O empréstimo pode ser concecido");

        }else {
            System.out.println("O empréstimo não pode ser concedido");
        }

        entrada.close();
    }
    
}
