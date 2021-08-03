package com.possible;

// \/ abstract serve p/ uma classe mãe que não instancia nada ou ninguém
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    // \/ construtor. Se não criarmos, o compilador cria automaticamente
    public Funcionario(){

    }

    // método abstrato de bonificação (sem implementação aqui, só nos filhos)
    // quando fazemos isso os filhos são OBRIGADOS a terem o método "getBonificação" específico
    public abstract double getBonificacao();

    //-- GETTERS AND SETTERS --//

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

//-- COMENTÁRIOS --//

    // \/ protected serve para os "filhos" (da herança) terem acesso ao atributo
    // protected double salario;
    // colocar o mínimo de atributos possível, só o necessário

