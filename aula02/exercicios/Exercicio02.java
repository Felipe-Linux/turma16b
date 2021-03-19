package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, calculo;

        System.out.println("Digite primeira nota do aluno: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite segunda nota do aluno: ");
        nota2 = teclado.nextDouble();

        

        calculo = (nota1 * 0.4) + (nota2 * 0.6);

        if (calculo >= 6.0) {
            System.out.println("Aprovado");
            
        }else {
            System.out.println("Reprovado");
        }

        teclado.close();
    }
    
}
