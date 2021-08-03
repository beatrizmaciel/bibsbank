package com.possible;

//                      \/ implementar uma interface
public class Cliente implements Autenticavel {

    private AutenticacaoUtil autenticador;

    // construtor
    public Cliente(){

        this.autenticador = new AutenticacaoUtil();

    }

    @Override
    public void setSenha(int senha) {
        // delegando a chamada para a classe AutenticacaoUtil
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.autenticador.autentica(senha);
        return autenticou;
        // ou simplesmente poderíamos ter escrito
            // return = this.util.autentica(senha);

    }
}
