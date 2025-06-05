public class Livro {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private double preco;

    public Livro(String titulo, Autor autor, Genero genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor.getNome() + " (" + genero.getNome() + ", " + genero.getDescricao() + ") - R$ " + preco;
    }

}

