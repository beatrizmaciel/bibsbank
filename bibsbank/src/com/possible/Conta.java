package com.possible;
public class Conta {
    // atributos/propriedades
    double saldo;
    int agencia;
    int numero;
    String titular;

    // Método (maneira de fazer algo, ação) com
    // sujeito. Diferente de função, que só ordena algo
    // Void não responde nada.
    //     \/ devolve      \/ recebe
    public void deposita(double valor){
        // valor morre dentro dessas chaves
        // o "this" para especificar a conta que estamos invocando
        // mas só para atributos da classe (fixos)
        this.saldo += valor;
        // ^ isso é igual a this.saldo = this.saldo + valor;

    }

    // não existe método dentro de método

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            // ^ isso é igual a this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    // separamos com vírgulas quando tem 1+ argumentos
    public boolean transfere(double valor, Conta destino) {
        // dentro do if só pode expressão booleana
        if (this.saldo >= valor) {
            this.saldo -= valor;
            // destino.saldo += valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

}

// objeto do tipo conta
// objeto/instância
// sempre que instanciamos objetos o valor padrão é zero (pra int e double)
// e pra boolean é false
