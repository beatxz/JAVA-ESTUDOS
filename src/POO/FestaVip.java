package POO;

public class FestaVip {
    int quantidadeCafe = 30;
     int quantidadeSalgado=50;

    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

     void beberCafe() {
        quantidadeCafe--;
        System.out.println("Bebeu 1 xicara de café");
    }

     void comerSalgado(){
        quantidadeSalgado--;
        System.out.println("Comeu 5 salgados");
    }
}
