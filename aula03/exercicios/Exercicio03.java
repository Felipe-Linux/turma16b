package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, cont;

        System.out.println("Digite um numero: ");
        limite = entrada.nextInt();

        cont = 1;

        while (cont <= limite) {
            if (cont==1) {
                System.out.print(cont);

            } else {
                System.out.printf(" , " + cont);
            }
            
            cont *= 2;
            
        }

        entrada.close();
    }
    
}
