package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Digite o salario: ");
        salario = entrada.nextDouble();

        if (salario <= 600.00) {
            System.out.println("Isento");
        } else {
            if (salario <= 1200.00) {
                System.out.println("Desconto de 20% do INSS");
            } else {
                if (salario <= 2000.00) {
                    System.out.println("Desconto de 25% do INSS");
                } else {
                    System.out.println("Desconto maior que 30% do INSS");
                }
            }
        }

        entrada.close();
    }

}
