package POO;

public class AppJava014Construtor {
    public static void main(String[]args){
        Produto produto = new Produto("feijão",30.50,50);
        produto.adicionarEstoque(80);
        System.out.println("A quantidade de produtos em estoque é: "+produto.getQuantidade());
        produto.removerEstoque(10);
        System.out.println("A quantidade de produtos em estoque é: "+produto.getQuantidade());
        System.out.println("O valor total do estoque é: R$"+produto.valorTotalEstoque());

    }
}
