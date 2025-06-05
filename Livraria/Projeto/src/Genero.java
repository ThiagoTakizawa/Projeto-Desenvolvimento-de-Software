public class Genero {
    private String nome, descricao;

    public Genero(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;   
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Genero = " + nome + ", descrição = " + descricao;
    }

}
