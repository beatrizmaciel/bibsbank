package com.possible;

public class Conta {
    // atributos/propriedades
    private double saldo;
    private int agencia;
    private int numero;
    // referenciando à classe Cliente
    private Cliente titular;
    //      \/ usamos static pra um atributo pra TODAS as classes Conta
    private static int total;

    // Os atributos que só tem "private" se referem a uma conta específica, enquanto que
    // os atributos com "private static" se referem à Classe como um todo,
    // "reutilizando" atributos em várias contas. Isso nos permite usar a sintaxe
    // Conta.saldo = 100;, em contrapartida a this.saldo, por exemplo. O this se refere
    // a uma conta específica.

    // \/ construtor (não é método, só é executado 1x)
    public Conta(int agencia, int numero){
        // \/ atributo da Classe Conta, podemos escrever só total++;
        Conta.total++;
        System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta " + this.numero);
    }

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

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode número menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    // no get, damos o return
    public int getAgencia(){

        return this.agencia;
    }

    // no set, declaramos o tipo do novo atributo
    public void setAgencia(int agencia){
        // \/ agencia não é o "this.agencia", mas sim a agência que vc quer "criar"
        if(agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    // dentro de um método estático vc não ++
    // ++ pode acessar um atributo de instância com this.
    //      \/ precisa especificar que é static (de novo)
    public static int getTotal(){
        return Conta.total;
    }
}