package POO;

public class AppJava05 {
    public static void main(String[] args) {
        notasMedia nota1 = new notasMedia();
        nota1.nome="Isabela";
        nota1.nota1=10;
        nota1.nota2=8.5;
        nota1.nota3=2;
        notasMedia nota2=new notasMedia();
        nota2.nome="Beatriz";
        nota2.nota1=3;
        nota2.nota2=4;
        nota2.nota3=5;
        notasMedia notas3=new notasMedia();
        notas3.nome="Maria";
        notas3.nota1=6;
        notas3.nota2=7;
        notas3.nota3=8;

        nota1.media();
        nota2.media();
        notas3.media();
    }
}
