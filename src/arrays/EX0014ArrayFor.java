package arrays;

public class EX0014ArrayFor {
    public static void main(String[] args) {

        String[] nomes = new String[]{
                "Isabela" , "Beatriz","Gisele","Gigi","Fabiane"
        };

        for (int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++) {
            System.out.print(nomes[posicaoVetor]+ " ");


        }
    }
}