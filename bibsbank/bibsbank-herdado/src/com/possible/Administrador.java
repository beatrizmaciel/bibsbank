package com.possible;

public class Administrador extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
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
