package exercicios.exercicio03;

public class AppVeiculo {

    public static void main(String[] args) {
        Veiculo v = new Veiculo("Chevrolet", "Cruze", -7.0);

        v.setConsumo(12);

        v.exibeDados();
        System.out.println("Consumo: " + v.getConsumo());

    }
    
}
