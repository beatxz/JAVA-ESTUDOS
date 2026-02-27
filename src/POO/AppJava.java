package POO;

public class AppJava {
    public static void main(String[] args) {
       // Iphone 12, tela 6.1" , 256gb
       //Galaxy Note 20 Ultra,tela 6.9" , 256gb
       //Xiaomi mi 11 Pro, tela 6.81", 128gb
        //<tipoVariavel> nomeVariavel=valor;

        //Declarando objeto tipo celular
        Celular celularA=new Celular();
        celularA.nome="iphone 12";
        celularA.tamanhoTela=6.1f;
        celularA.espacoArmazenamento=256;
        celularA.sistemaOperacional="IOS";

        Celular celularB=new Celular();
        celularB.nome="Galaxy Note 20 Ultra";
        celularB.tamanhoTela=6.9f;
        celularB.espacoArmazenamento=256;
        celularB.sistemaOperacional="ANDROID";

        Celular celularC=new Celular();
        celularC.nome="Xiaomi mi 11 Pro";
        celularC.tamanhoTela=6.81f;
        celularC.espacoArmazenamento=128;
        celularC.sistemaOperacional="ANDROID";


        System.out.format("Celular %s com tela de %.1f com %dgb e SO %s\n ",celularA.nome,celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f com %dgb e SO %s\n ",celularB.nome,celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f com %dgb e SO %s ",celularC.nome,celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);

    }
}
