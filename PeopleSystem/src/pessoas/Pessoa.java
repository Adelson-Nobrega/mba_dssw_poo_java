package pessoas;

import auxiliares.Endereco;
import auxiliares.Telefone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected Endereco endereco;
    protected List<Telefone> telsContato = new ArrayList<>();

    public int obterIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataNascimento.getYear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelsContato() { return telsContato; }

    public void adicionarTelefone(Telefone telefone) {
        this.telsContato.add(telefone);
    }
}