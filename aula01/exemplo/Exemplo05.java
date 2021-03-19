package exemplo;

public class Exemplo05 {
    public static void main(String[] args) {
        double valor = 345.987;
        int numero = 34;

        System.out.println(valor);
        //System.out.println(FORMATO, VARIAVEIS);
        // %d - int, %f - double, %s - string

        System.out.printf("%f\n", valor);
        System.out.printf("%.2f\n", valor);

        System.out.printf("int = %d, double = %f", numero, valor);
    }
}
