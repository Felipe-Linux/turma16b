package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d, soma1, soma2;
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        soma1 = c + d;
        soma2 = a + b;

        if ((b > c) && (d > a) && (soma1 > soma2) && (c + d != 0) && (a % 2 ==0)){
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }

        entrada.close();

    }
    
}
