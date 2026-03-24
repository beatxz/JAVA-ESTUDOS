package POO.heranca;

public abstract class  Employe {
    private String name;
    private double salary;

    public Employe (String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public abstract double calculateBonus();

    public String toString(){
        return "Name: "+name+"\nSalary: "+salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

}
