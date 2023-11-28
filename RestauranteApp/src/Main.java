package RestauranteApp.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Coxinha", 5);
        Produto p2 = new Produto("Pastel", 4);
        Produto p3 = new Produto("Enroladinho", 3.5);

        Pedido pedido1 = new Pedido();
        pedido1.setQuantidade(5);
        pedido1.setProduto(p2);

        pedido1.exibirProduto();

        Pedido pedido2 = new Pedido(3, p3);
        pedido2.exibirProduto();

        pedido2.setProduto(p1);
        pedido2.setQuantidade(6);
        pedido2.exibirProduto();
    }
}