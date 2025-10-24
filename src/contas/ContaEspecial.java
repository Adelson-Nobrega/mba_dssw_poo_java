package contas;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, String nome, double limite) {
        super(numero, nome);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        double usoLimite = valor - this.saldo;
        if (valor > this.saldo + this.limite || valor <= 0) {
            return false;
        }
        if (valor <= this.saldo) {
            setSaldo(this.saldo - valor);
        } else {
            setSaldo(0);
            this.limite -= usoLimite * 1.005;
            System.out.println("Você usou R$ " + usoLimite + " do seu limite de crédito e foi cobrado 0,5% de encargos!");
        }
        return true;
    }

    public double getLimite() {
        return this.limite;
    }
}
