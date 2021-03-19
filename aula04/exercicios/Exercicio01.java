package exercicios;

public class Exercicio01 {

    public static void main(String[] args) {

        String valor;
        valor = devolveValor(2);
        System.out.println(valor);
        
    }

    static String devolveValor(int numero){
        if (numero % 2 ==0){
            return "Número é par";
        }else {
            return "Número é impar";
        }
        
    }
    
}
