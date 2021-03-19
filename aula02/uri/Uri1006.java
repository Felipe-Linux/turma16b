package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, media, nota1, nota2, nota3;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        nota1 = a * 2;
        nota2 = b * 3;
        nota3 = c * 5;

        media = (nota1 + nota2 + nota3) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();


    }
}
