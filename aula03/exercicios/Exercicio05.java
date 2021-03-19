package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, numero, somaPar, somaImpar;

        somaPar = 0;
        somaImpar = 0;

        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Entre com um numero: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0){
                somaPar = somaPar + 1;
                

            } else {
                somaImpar = somaImpar + 1;

            }
            

        }
        System.out.println("O Total de pares é: " + somaPar);
        System.out.println("O Total de impar é: " +somaImpar);
        
             entrada.close();    
    }

    
}
