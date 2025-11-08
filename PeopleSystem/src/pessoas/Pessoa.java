package pessoas;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected String endereco;
    protected String telsContato;

    public String obterIdade() {
        return "idade";
    }
}
