package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double codPeca1, numPeca1, codPeca2, numPeca2, valorUnit1, valorUnit2, calculo, soma1, soma2;

        codPeca1   = teclado.nextDouble();
        numPeca1   = teclado.nextDouble();
        valorUnit1 = teclado.nextDouble();
        codPeca2   = teclado.nextDouble();
        numPeca2   = teclado.nextDouble();
        valorUnit2 = teclado.nextDouble();
        

        soma1 = numPeca1 * valorUnit1;
        soma2 = numPeca2 * valorUnit2;

        calculo = soma1 + soma2; 

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", calculo);

        teclado.close();





        




    }
    
}
