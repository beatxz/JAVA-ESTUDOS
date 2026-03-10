package POO;

public class AppJava09GetSet {
    public static void main(String[]args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bia");
        pessoa.setAltura(1.85);
        pessoa.setIdade(25);

        System.out.println("Nome: " +pessoa.getNome());
        System.out.println("Altura: "+pessoa.getAltura());
        System.out.println("Idade: "+pessoa.getIdade());


    }
}
