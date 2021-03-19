package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double QTDE_NUMEROS = 6;
        double valor, somaPositivo, positivo, mediaPositivo;

        positivo = 0;
        somaPositivo = 0;
        mediaPositivo = 0;

        for(double i=1; i <= QTDE_NUMEROS; i++) {
            System.out.println("Digite seis números: ");
            valor = entrada.nextDouble();
            if (valor >= 0) {
                somaPositivo = somaPositivo + valor;
                positivo++;

            }
            

        }
            System.out.printf(somaPositivo + "valores positivos");
            mediaPositivo = somaPositivo / positivo;
            System.out.printf(".%1d", mediaPositivo);

        entrada.close();


    }
    
}
