public class Autor {
    private String nome, nacionalide;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalide = nacionalidade;
    }

    public String getNacionalide() {
        return nacionalide;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Autor = " + nome + ", nacionalide = " + nacionalide;
    }

}
