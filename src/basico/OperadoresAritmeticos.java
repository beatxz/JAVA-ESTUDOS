package basico;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
       double pao = 10.0;
       double queijo = 4.50;
       double acucar = 5.30;
       double desconto = 5.00;
       int totalDeDiasNoMes = 30;

       double valorTotal = pao / queijo + acucar;
       double valorTotalComDesconto = valorTotal - desconto;
       double valorTotalMensal = valorTotalComDesconto * totalDeDiasNoMes;

       System.out.println("Valor total : R$" + valorTotalMensal  );
    }
}
