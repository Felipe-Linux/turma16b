package exemplos.exemplo03;

public class Pessoa {
    // atributos
    String nome;

    //metodos
    void apresentar() {
      
      System.out.println("Olá! Eu sou " + nome);
    }

    Pessoa(String nome){
        this.nome = nome;
    }
    
}
