package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o comprimento do lado A: ");
        a = entrada.nextInt();
        System.out.println("Digite o comprimento do lado B: ");
        b = entrada.nextInt();
        System.out.println("Digite o comprimento do lado C: ");
        c = entrada.nextInt();

        if ((a > (b+c)) || (b > (a+c)) || (c > (b+c))) {
            System.out.println("Não formam triangulo algum");
        }else {
            if ((a==b) && (b==c)) {
                System.out.println("Triangulo Equilátero");
            }

            else {
                if((a==b) && (b==c) && (a==c)){
                    System.out.println("Triangulo Isóceles");
                }
            else {
                System.out.println("Triangulo Escaleno");
            }
        }
        }
        

        entrada.close();




    }
    
}
