package POO.Constante.Ex001;

public class Cpf {
    private static final int INDICATE_REGION_CPF = 8;
    private static final int INDICATE_FIRST_VERIFIER = 10;
    private static final int INDICATE_SECOND_VERIFIER = 10;

    public void validate (String cpf){
        // ABC.DEF.GHI-JK
        //A-H: IDENTIFICADOR QUE A RF EMITE
        //I(8): REGIÃO ONDE FOI EMITIDO
        //J(9):DIGITOS VERIFICADORES
        //K(10): DIGITOS VERIFICADORES
        int region = cpf.charAt(INDICATE_REGION_CPF);
        int firstCheckerDigit = cpf.charAt(INDICATE_FIRST_VERIFIER);
        int secondCheckerDigit = cpf.charAt(INDICATE_SECOND_VERIFIER);



    }
}