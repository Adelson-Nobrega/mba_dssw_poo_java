package contas;

public class Conta {
    public int numero;
    public String nome;
    private double saldo;

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
    }

    public boolean sacar(double valor) {
        if (this.saldo < valor || valor <= 0) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta {\n" +
                "  Número: " + numero + "\n" +
                "  Nome  : " + nome + "\n" +
                "  Saldo : " + saldo + "\n" +
                "}\nVem pra Caixa você também!\n";
    }

}
//Façam um saque e cada uma das contas, e imprima
// o novo saldo (apenas) de cada uma delas
//Criem o depositar e utilize m cada uma das contas,
// e imprima o novo saldo (apenas) de cada uma delas

