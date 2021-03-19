package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero;

        System.out.println("Digite um número: ");
        numero = entrada.nextFloat();

        if (numero <= 25.00) {
            System.out.println("Intervalo [0,25]");
        }else {
            if(numero <= 50.00) {
                System.out.println("Intervalo [25,50]");

            }
        
            else {
                if (numero <= 75.00) {
                    System.out.println("Intervalo [50,75]");
                }
            
            else {
                if(numero <= 100.00) {
                    System.out.println("Intervalo [75,100]");

                }
             else {
            System.out.println("Fora de intervalo");
            }
        }
        
    }
    }


    entrada.close();    

    }

}
