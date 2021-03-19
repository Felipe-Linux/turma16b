package exercicios.exercicio05;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Python", "Felipe", 500);

        System.out.println("Página atual: " + livro.exibirPagina());

        livro.irParaPagina(-1);
        System.out.println("página atual: " + livro.exibirPagina());
        livro.irParaPagina(3);
        System.out.println("página atual: " + livro.exibirPagina());
        livro.irParaPagina(2);
        System.out.println("página atual: " + livro.exibirPagina());

        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        System.out.println("página atual: " + livro.exibirPagina());

        livro.exibirCapa();
        System.out.println("página atual: " + livro.exibirPagina());




    }
    
}
