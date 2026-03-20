package heranca;

public class Caracter {
    private String name;
    private String classe;
    private int level;

    public Caracter (String name) {
        this.name = name;
        this.classe = "None";
        this.level = 1;
    }
    @Override
    public String toString(){
        String information = String.format("%s (level : %d) - Class : %s",name,level,classe);
        return information;
    }

    public  void attacked(){
        System.out.println("The character attacked");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getClasse(){
        return classe;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }




}
