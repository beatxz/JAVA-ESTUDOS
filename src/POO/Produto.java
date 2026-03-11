package POO;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto (String nome, double preco, int quantidade) {
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade>0){
            System.out.println("A quantidade: "+quantidade+" foi adicionada com sucesso ");
            this.quantidade+=quantidade;
        }else{
            System.out.println("Adicione um numero positivo de produto");
        }
    }
    public void removerEstoque(int quantidade) {
        if (this.quantidade < quantidade){
            System.out.println("Quantidade insuficiente no estoque");
        }else{  System.out.println("A quantidade: "+quantidade+" foi removida com sucesso ");
         this.quantidade-=quantidade;}

    }
    public double valorTotalEstoque(){
        return preco*quantidade;

    }

    }

