package POO.Polimorfismo;

public class Calculator {
    public void sum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public void sum(int a,int b,int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
    public void sum(double a,double b){
        double sum=a+b;
        System.out.println(sum);
    }
}
