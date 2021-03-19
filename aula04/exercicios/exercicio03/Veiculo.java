package exercicios.exercicio03;

public class Veiculo {

    private String marca;
    private String modelo;
    private double consumo;

    public void exibeDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);

    }

    public double getConsumo() {
        
        return consumo;
    }

    public void setConsumo(double novoConsumo){
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }

    }



    Veiculo(String marca, String modelo, double consumo) {

        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        setConsumo(consumo);

    }


    
}
