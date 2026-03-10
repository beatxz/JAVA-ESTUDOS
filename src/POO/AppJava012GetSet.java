package POO;

public class AppJava012GetSet {
    public static void main(String[]args){
        Alunos aluno = new Alunos();
        aluno.setNome("Isabela");
        aluno.setNota1(25);
        aluno.setNota2(35);
        aluno.setNota3(35);

        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Nota1: "+aluno.getNota1());
        System.out.println("Nota2: "+aluno.getNota2());
        System.out.println("Nota3: "+aluno.getNota3());
        System.out.println("A nota final foi: "+aluno.notaFinal());
        aluno.aprovado();
    }
}
