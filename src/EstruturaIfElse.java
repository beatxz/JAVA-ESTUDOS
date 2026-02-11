public class EstruturaIfElse {
    public static void main(String[] args) {

//        int idade = 15;
//
//        if (idade >=18) {
//            System.out.println("Voce é maior de idade.");
//        }
//        else {
//            System.out.println("Voce é menor de idade.");
//        }
//        boolean estaChovendo = true;
//
//        if (!estaChovendo) {
//            System.out.println("Vamos sair para passear ");
//        } else {
//            System.out.println("Vamos ficar em casa");
//        }

        boolean temdinheiro = false;
        boolean temcartao = false;

        if(temdinheiro && temcartao) {
            System.out.println("Pede um ifood e zé delivery");
        }
        else if(temdinheiro) {
            System.out.println("pede um ifood");
        }
        else if (temcartao) {
            System.out.println("Pede um zé delivery");
        }
        else {
            System.out.println("não pede nada");
        }


            }
        }





