package com.possible;

// construtores não vêm como herança
public class ContaCorrente extends Conta implements Tributavel {

    // quando criamos um construtor, o Java automaticamente
    // chama o construtor da Classe Mãe
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }


    // \/ anotação/incremento na configuração do método
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    //-- Implementação da Interface Tributavel --//

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
