package com.possible;

public class TestaMetodo {

    public static void main(String[] args) {
        //classe Conta | variável conta | criar objeto "new"
        Conta contaUm = new Conta();
        contaUm.saldo = 100;
        // essa ação é puxada de Conta.java
        contaUm.deposita(50);

        System.out.println("O saldo da Conta Um é " + contaUm.saldo);

        contaUm.saca(20);
        System.out.println("O novo saldo da Conta Um é " + contaUm.saldo);

        Conta contaDois = new Conta();
        contaDois.deposita(1000);

        // simples: contaDois.transfere(300, contaUm);
        // complexo (com if):
        if (contaDois.transfere(3000, contaUm)) {
            System.out.println("Transferência efetuada");
        } else {
            System.out.println("Saldo insuficiente para efetuar transferência");
        }

        System.out.println(contaDois.saldo);
        System.out.println(contaUm.saldo);

        contaUm.titular = "Maurício Antunes";
        System.out.println(contaUm.titular);
    }

}
