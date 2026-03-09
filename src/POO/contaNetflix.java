package POO;

import javax.swing.*;

public class contaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar(){
        identificarResolucao();
        buscarPreferenciasDoUsuario();
    }
    private void buscarPreferenciasDoUsuario(){
        idiomaPreferencial = "PT-BR";
    }
    private void identificarResolucao(){
        resolucaoTela = "Full HD";
    }
    public void assistirFilmes(String nomeFilme){
        System.out.println("Iniciando filme "+nomeFilme);
        System.out.println("Carregando filme na resolução " + resolucaoTela);
    }


   }

