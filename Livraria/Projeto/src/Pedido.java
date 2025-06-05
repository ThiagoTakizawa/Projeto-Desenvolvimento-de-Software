import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //Cria um arraylist de livros
    protected List<Livro> itens; 

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        itens.add(livro);
    }

    //Percorre o arraylist de livros (itens), para cada livro pega o preço e soma
    public double calcularTotal() {
        double total = 0;
        for (Livro livro : itens) { 
            total += livro.getPreco();
        }
        return total;
    }

    //Percorre o arraylist e mostra os dado de cada livro do pedido
    public void listarItens() {
        for (Livro livro : itens) { 
            System.out.println(livro);
        }
        System.out.println("Valor total do pedido: R$ " + calcularTotal());
    }
}
