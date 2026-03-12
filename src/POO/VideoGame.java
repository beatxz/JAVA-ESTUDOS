package POO;

public class VideoGame {
    private Jogo jogo;
    private boolean estaLigado;

    public void ligar(){
        System.out.println("Ligando videogame...");
        this.estaLigado = true;
    }
    public void jogar(Jogo jogo){
        if(estaLigado=true) {
            System.out.println("Iniciando jogo...");
            this.jogo = jogo;
            jogo.jogar();
        }else{
            System.out.println("VideoGame esta desligdo");
        }
    }
    public void fechar(){
        if(estaLigado=true) {
            System.out.println("Fechando jogo...");
            boolean temJogoRodando= jogo!=null;
            if (jogo != null) {
                jogo.fechar();
                jogo = null;
            }else{
                System.out.println("Não tem nenhum jogo rodando");
            }
        }else{
            System.out.println("VideoGame esta desligdo");
        }

    }
}

