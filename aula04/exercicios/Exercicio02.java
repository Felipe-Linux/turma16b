package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {

        int resultado;
        resultado = retornaValor(2, 2, 7);
        System.out.println(resultado);
        
    }

    static int retornaValor(int a, int b, int c){
        if ((a <= b) && (a <= c)){
            return a;
        }
        if ((b <= a) && (b <= c)) {
            return b;
        }
        return c;
    

        
    }
    
}
