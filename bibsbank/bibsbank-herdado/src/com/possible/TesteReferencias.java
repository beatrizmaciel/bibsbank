package com.possible;

public class TesteReferencias {

    public static void main(String[] args) {

        // Polimorfismo
        // \/ referência (genérico)
        // Funcionario g2 = new Gerente();
        Gerente g2 = new Gerente();
        //                 /\ objeto (específico)
        g2.setNome("Maura");
        g2.setSalario(5000);

        Diretor d1 = new Diretor();
        d1.setNome("Amélia");
        d1.setSalario(2500);

        Designer des1 = new Designer();
        des1.setNome("Laura");
        des1.setSalario(3000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g2);
        controle.registra(d1);
        controle.registra(des1);

        System.out.println(controle.getSoma());



    }

}
