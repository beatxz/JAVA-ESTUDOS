package POO.heranca;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.printf("Nome: %s\n salary: $ %.2f%n\n",getName(),getSalary());

    }
    public String getName() {
        return name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

}
