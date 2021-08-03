package com.possible;

public class Conta {
    // atributos/propriedades
    private double saldo;
    int agencia;
    int numero;
    // referenciando à classe Cliente
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    //              \/ método getter
    public double getSaldo(){
        return this.saldo;
    }

}