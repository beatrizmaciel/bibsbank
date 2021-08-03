package com.possible;

public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente eduarda = new Gerente();
        eduarda.setNome("Eduarda Braga");
        eduarda.setCpf("9999999-9");
        eduarda.setSalario(3200);

        System.out.println(eduarda.getNome());
        System.out.println(eduarda.getBonificacao());


    }
}
