package POO;

public class Estoque {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setAdicionar(int quantidade){
        this.quantidade += quantidade;
    }
    public void setRemover(int quantidade){
        if(this.quantidade<quantidade){
            System.out.println("Não é permitido remover mais do que existe em estoque!!");
        }else{
        this.quantidade -= quantidade;
        }
    }
    public double valorTotalEstoque(){
        return preco*quantidade;
    }
}

