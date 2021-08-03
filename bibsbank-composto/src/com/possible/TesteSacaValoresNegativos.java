package com.possible;

public class TesteSacaValoresNegativos {

    public static void main(String[] args) {
    // \/ classe \/ variável
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);
        System.out.println(conta.getSaldo());

    }
}