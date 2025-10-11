package contas;

public class ContaInvest extends Conta {
    public double taxa;
    public int prazo;

    public ContaInvest(int numero, String nome, double taxa, int prazo) {
        super(numero, nome);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    @Override
    public boolean sacar(double valor) {
        System.out.println("Você está sacando de sua Conta Investimento!");
        return super.sacar(valor);
    }

    @Override
    public boolean depositar(double valor) {
        System.out.println("Você está depositando em sua Conta Investimento!");
        return super.depositar(valor);
    }

    public void aplicarRendimento() {
        this.saldo *= Math.pow((1 + this.taxa/100), this.prazo);
        System.out.println("Seu saldo com o rendimento aplicado é: " + this.saldo);
    }
}
