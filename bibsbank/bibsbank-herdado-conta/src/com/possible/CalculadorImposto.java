package com.possible;

/**
 * @author Beatriz Maciel
 * @version 1.0
 *
 */

@DoublePositivo // teste

public class CalculadorImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    //-- GETTERS and SETTERS --//

    public double getTotalImposto() {
        return totalImposto;
    }
}
