package exercicios;


import java.util.Scanner;



public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, numero, soma;

        cont = 1;
        numero = 1;
        soma = 0;

        while (numero != 0) {
            System.out.printf("Digite o %d numero (0 = fim): ", cont);
            numero = entrada.nextInt();
            soma = soma + numero;
           
            
            cont++;
        }
        System.out.println("Soma : " + soma);
        entrada.close();
    }
    
}
