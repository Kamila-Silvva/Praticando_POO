package ExercicioPOO.Livro;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = paginaAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void exibirDetalhes () {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de páginas: " + numeroDePaginas);
    }

    public void setPaginaAtual(int paginaAtual) {
        if (paginaAtual > 0 && paginaAtual <= numeroDePaginas) {
            this.paginaAtual = paginaAtual;
        } else {
            System.out.println("Número de páginas inválidas");
        }
    }

    public void avancarPagina() {
        if (paginaAtual < numeroDePaginas) {
            paginaAtual++;
            System.out.println("Avançou para a página: " + paginaAtual);
        } else {
            System.out.println("Você está na última página");
        }
    }

    public void retrocederPagina() {
        if (paginaAtual > 1) {
            paginaAtual--;
            System.out.println("Retrocedeu para a página: " + paginaAtual);
        } else if (paginaAtual > numeroDePaginas) {
            paginaAtual = numeroDePaginas;
            System.out.println("Número de página inválido. Página atual definida para a última página.");
        } else {
            System.out.println("Você está na primeira página");
        }
    }

    public void exibirPaginaAtual() {
        System.out.println("Página Atual: " + paginaAtual);
    }
}

