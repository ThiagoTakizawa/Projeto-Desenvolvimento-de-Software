public class PedidoOnline extends Pedido {
    private static double frete = 20;

    //usa o método calcularTotal da classe mãe e adiciona o frete
    @Override
    public double calcularTotal(){
        return super.calcularTotal() + frete; 
    }

    public void listarItens() {
        for (Livro livro : itens) {
            System.out.println(livro);
        }
        System.out.println("Valor total do pedido com frete: R$ " + calcularTotal());
    }
}
