package br.com.fiap.fintech.modelos;

public class Despesa {
    // Convenção Java para nomes de variáveis: camelCase
    private float valorDespesa;
    private int codigoTransacao;

    // Construtor
    public Despesa(float valorReceita, int codigoTransacao) {
        this.valorDespesa = valorReceita;
        this.codigoTransacao = codigoTransacao;
    }

    // Getters e Setters
    public float getValorDespesa() {
        return valorDespesa;
    }

    public void setValorReceita(float valorReceita) {
        this.valorDespesa = valorReceita;
    }

    public int getCodigoTransacao() {
        return codigoTransacao;
    }

    public void setCodigoTransacao(int codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }
}
