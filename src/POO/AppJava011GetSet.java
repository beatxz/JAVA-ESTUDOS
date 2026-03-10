package POO;

public class AppJava011GetSet {
    public static void main(String []args){
        Estoque produto = new Estoque();

        produto.setNome("Feijão");
        produto.setPreco(10.90);
        produto.setQuantidade(1000);
        produto.setAdicionar(10);
        produto.setRemover(20);

        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor do produto: R$"+produto.getPreco());
        System.out.println("Quantidade em estoque: "+produto.getQuantidade());
        System.out.println("O valor total do estoque do produto: R$"+produto.valorTotalEstoque());
    }

}
