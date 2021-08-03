package com.possible;

public class CriaConta {
    public static void main(String[] args) {
        // declarando variável com a classe Conta.
        // Estamos criando a primeiraConta, que é
        // um objeto da classe Conta
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        System.out.println("O saldo é " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("O saldo agora é " + primeiraConta.saldo);

        // usamos "new Conta" pra instanciar um espaço na memória
        // começamos a linha com Conta porque esse objeto não é
        // um int ou um double, e sim um tipo Conta, criado em outro arquivo
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("O saldo da segunda conta é " + segundaConta.saldo);
    }
}