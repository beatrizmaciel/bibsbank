package com.possible;

// contrato Autenticavel
    // quem assinar esse contrato precisa implementar
        // metodo setSenha
        // metodo autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}

//---- COMENTÁRIOS ---//
//
// Dentro de uma interface não há nada concreto (atributos, implementações de métodos, etc)