package com.possible;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente mauricio = new Cliente();
        mauricio.nome = "Maurício Antunes";
        mauricio.cpf = "222.222.222-22";
        mauricio.profissao = "Programador";

        Conta contaDoMauricio = new Conta();
        contaDoMauricio.deposita(100);

        // composição da orientação à objetos
        // associa o cliente à conta contaDoMauricio
        contaDoMauricio.titular = mauricio;
        System.out.println(contaDoMauricio.titular.nome);

        // contaDoMauricio e mauricio (declarada na linha 6)
        // referenciam para o mesmo lugar, para o mesmo cliente

    }

}
