package pessoas;

import auxiliares.Endereco;
import auxiliares.Telefone;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected Endereco endereco;
    protected Telefone telsContato;

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

    public Telefone getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telefone) {
        this.telsContato = telefone;
    }
}
