package com.possible;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta contaDaBibs = new Conta(105, 9566);
        contaDaBibs.setNumero(1123);
        System.out.println(contaDaBibs.getNumero());

        Cliente bibs = new Cliente();

        // aqui altera o titular e refere ao cliente que criamos
        contaDaBibs.setTitular(bibs);
        bibs.setNome("Bibs White Castle");

        System.out.println(contaDaBibs.getTitular().getNome());

        // para alterar algo:
        contaDaBibs.getTitular().setProfissao("Programadora");

        System.out.println(contaDaBibs.getTitular().getProfissao());

    }

}
