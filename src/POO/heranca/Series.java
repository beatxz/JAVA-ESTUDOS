package POO.heranca;

public class Series {
    private String name;
    private int seasons;
    private int year;

    public Series(String name, int seasons, int year){
        this.name = name;
        this.seasons = seasons;
        this.year = year;
    }

    @Override
    public String toString(){
        String information = String.format("Name: %s (%d) - %d seasons",name,year,seasons);
        return information;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSeasons(){
        return this.seasons;
    }
    public void setSeasons(int seasons){
        this.seasons = seasons;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
}
