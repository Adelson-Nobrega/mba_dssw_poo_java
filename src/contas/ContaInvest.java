package contas;

public class ContaInvest extends Conta {
    private final double taxa;
    private final int prazo;

    public ContaInvest(int numero, String nome, double taxa, int prazo) {
        super(numero, nome);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    @Override
    public boolean sacar(double valor) {
        System.out.println("Você está sacando em sua Conta Investimento!");
        return super.sacar(valor);
    }

    public void aplicarRendimento() {
        setSaldo(getSaldo() * Math.pow((1 + this.taxa/100), this.prazo));
        System.out.println("Seu saldo com o rendimento aplicado é: R$ " + getSaldo());
    }
}
