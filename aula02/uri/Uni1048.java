package uri;

import java.util.Scanner;

public class Uni1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salarioAtual, salarioNovo, reajusteGanho;

        System.out.println("Digite o salário atual: ");
        salarioAtual = entrada.nextFloat();

        if (salarioAtual > 0 && salarioAtual <=400) {
            salarioNovo = salarioAtual * 0.15;
            reajusteGanho = salarioNovo - salarioAtual;
            System.out.println("Novo salario: " + salarioNovo);
            System.out.println("Reajuste ganho: " + reajusteGanho);
            System.out.println("Em porcentagem: 15%");
            

        }

    
    }

    
}
