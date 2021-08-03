package com.possible;

public class TestaSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno verificacaoSistema = new SistemaInterno();
        verificacaoSistema.autentica(g);
        verificacaoSistema.autentica(adm);
        verificacaoSistema.autentica(cliente);


    }

}
