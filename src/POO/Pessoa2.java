package POO;

public class Pessoa2 {

    private String nome;
    private int idade;
    private float altura;

    public Pessoa2(String nome, int idade, float altura){
        System.out.println("Nova pessoa");
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

