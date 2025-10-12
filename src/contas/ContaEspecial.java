package contas;

public class ContaEspecial extends Conta {
    public double limite;

    public ContaEspecial(int numero, String nome, double limite) {
        super(numero, nome);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor *1.01);
    }
}
