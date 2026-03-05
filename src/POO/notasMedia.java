package POO;

public class notasMedia {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    void media(){
        double media = (nota1+nota2+nota3)/3;
        System.out.println(nome+ " sua média é: "+media);
        if(media>=7){
            System.out.println("Está aprovado");
        }else{
            System.out.println("Está reprovado");
        }

    }
}
