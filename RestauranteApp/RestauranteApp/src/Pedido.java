public class Pedido {
    //atributos
    private int quantidade;
    private Produto produto;

    //construtores
    public Pedido(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Pedido(){

    }

    //gets e sets
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    //outros metodos
    public double calcularPrecoTotal(){
        double precoFinal;
        precoFinal = this.quantidade * produto.getPrecoUnit();
        return precoFinal;
    }

    public void exibirProduto(){
        System.out.println("Produto: " + this.produto.getNomePrato());
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço Unitario: " + this.produto.getPrecoUnit());
        System.out.println("-----------------------------------------------");
        System.out.println("Preço Final: " + this.calcularPrecoTotal());
        System.out.println();
    }

}
