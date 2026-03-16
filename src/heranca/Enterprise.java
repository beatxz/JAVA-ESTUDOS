package heranca;

public class Enterprise {

    public static void main(String[] args) {

        Employee employee = new Employee("Isabela", 6000);
        Manager manager = new Manager("Beatriz",15000,5000);

        System.out.println("Employee: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());

        System.out.println();

        System.out.println("Manager: " + manager.getName());
        System.out.println("Salary: $" + manager.getSalary());
        System.out.println("Bonus: $" + manager.getBonus());
        System.out.println("Total Salary: $" + manager.totalSalary());
    }
}
