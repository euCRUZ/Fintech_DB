package br.com.fiap.fintech.modelos;

public class Receita {
    // Convenção Java para nomes de variáveis: camelCase
    private float valorReceita;
    private int codigoTransacao;

    // Construtor
    public Receita(float valorReceita, int codigoTransacao) {
        this.valorReceita = valorReceita;
        this.codigoTransacao = codigoTransacao;
    }

    // Getters e Setters
    public float getValorReceita() {

        return valorReceita;
    }

    public void setValorReceita(float valorReceita) {

        this.valorReceita = valorReceita;
    }

    public int getCodigoTransacao() {

        return codigoTransacao;
    }

    public void setCodigoTransacao(int codigoTransacao) {

        this.codigoTransacao = codigoTransacao;
    }



}
