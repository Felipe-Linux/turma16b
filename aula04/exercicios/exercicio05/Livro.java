package exercicios.exercicio05;

public class Livro {

    //atributos
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Livro(String titulo, String autor, int totalPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;;

    }

    public void avancarPagina(){
        if (paginaAtual < totalPaginas){
            paginaAtual++;
        
    }
}

    public void retorcedorPagina(){
        if(paginaAtual > 0){
            paginaAtual--;
    }
}

    public void irParaPagina(int novaPagina){
        if(novaPagina < -1 && novaPagina <= totalPaginas) {
            novaPagina = paginaAtual;
        }


    }

    public int exibirPagina(){
        return paginaAtual;
    }

    public void exibirCapa(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + totalPaginas);
    }


    
}
