package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int par, impar, positivo, negativo, numero, somaPar;
        final int QTD_NUMEROS = 5;

        par = 0;
        somaPar = 0;

        for (int i=1; i <= QTD_NUMEROS; i++){
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            if (numero % 2 ==0) {
                par++;
                somaPar = somaPar + numero;
            } else {
                if (numero) {

                }
            }
        }

        

    }
    
}
