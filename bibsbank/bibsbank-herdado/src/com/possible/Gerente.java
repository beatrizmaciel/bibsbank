package com.possible;

// \/ método            \/ herança          \/ implementação de interface
public class Gerente extends Funcionario implements Autenticavel {

    private final AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    // reescrevemos a mesma assinatura do método de Funcionário (doador da herança)
    // que será adaptado para cada "filho" do "pai" Funcionário
    public double getBonificacao(){
        System.out.println("Bonificação do Gerente");
        //            \/ de Funcionario  \/ isso significa que o "this" na verdade é da classe mãe
        return super.getSalario();
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
