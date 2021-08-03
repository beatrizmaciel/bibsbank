package com.possible;

public class ControleBonificacao {

    // atributo para somar as bonificações
    private double soma;

    public void registra(Funcionario f){
        double bonificacao = f.getBonificacao();
        this.soma += bonificacao;
    }

    //-- GETTERS and SETTERS --//

    public double getSoma() {
        return soma;
    }
}
