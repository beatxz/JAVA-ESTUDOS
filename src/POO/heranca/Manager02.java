package POO.heranca;

public class Manager02 extends Employe {
    public Manager02(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double calculateBonus() {
        return getSalary()*0.2;
    }
    @Override
    public String toString(){
        return "Name: "+getName()+"\nSalary: "+getSalary()+"\nBonus: "+calculateBonus();
    }
}
