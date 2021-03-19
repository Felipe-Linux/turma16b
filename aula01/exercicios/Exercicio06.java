package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medida;

        System.out.println("Digite a quantidade de KM: ");
        medida = entrada.nextDouble();

        medida = medida * 062137;
        System.out.printf("Milhas: %f" + medida);
        medida = medida * 1.760;
        System.out.println("Jardas: %f" + medida);
        medida = medida * 3;
        System.out.println("Polegadas: %f" + medida);
        medida = medida + 12;
        System.out.println("Pes %3.f" + medida);

        entrada.close();



    }
    
}
