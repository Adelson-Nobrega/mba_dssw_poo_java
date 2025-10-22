package contas;

public class ContaEspecial extends Conta {
    private double limite;
    private double usoLimite = 0;

    public ContaEspecial(int numero, String nome, double limite) {
        super(numero, nome);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        double saldoP = getSaldo();
        if (valor > saldoP + this.limite || valor <= 0) {
            return false;
        }
        if (valor <= saldoP) {
            setSaldo(saldoP - valor);
            return true;
        } else {
            this.usoLimite = valor - saldoP;
            setSaldo(0);
            this.limite -= this.usoLimite * 1.005;
            System.out.println("Você usou R$ " + this.usoLimite + " do seu limite de crédito e foi cobrado 0,5% de encargos!");
            return true;
        }
    }

    public double getLimite() {
        return this.limite;
    }
}
