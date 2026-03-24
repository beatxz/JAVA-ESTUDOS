package POO.heranca;

public class Developer extends Employe  {
    public Developer(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double calculateBonus() {
        return getSalary()*0.1;
    }
    @Override
    public String toString() {
        return "Name: "+getName()+"\nSalary: "+getSalary()+"\nBonus: "+calculateBonus();
    }

}
