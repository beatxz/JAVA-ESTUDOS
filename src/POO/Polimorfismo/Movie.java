package POO.Polimorfismo;

public class Movie extends Video {
    private String audio;
    private String subtitle;


    public Movie(String name) {
        super(name);
        this.audio = "English";
        this.subtitle = "none";
    }

    @Override
    public void play(){
        System.out.println("Play movie: "+getName());
    }
    public void play(String audio, String subtitle){
        this.audio = audio;
        this.subtitle = subtitle;
        System.out.println("Play "+toString());
    }
    public void play(String audio){
        System.out.println("Play "+toString());
        this.audio = audio;
    }
    @Override
    public String toString(){
        String information = String.format("Movie %s (audio %s, subtitle %s)",getName(),audio,subtitle);
        return information;

    }

}
