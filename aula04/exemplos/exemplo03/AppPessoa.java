package exemplos.exemplo03;

public class AppPessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson"); // instanciação, criação do objeto
        Pessoa p2 = new Pessoa("Amanda");

        p.apresentar();

        p2.apresentar();
    }
    
}
