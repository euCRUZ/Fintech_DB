package br.com.fiap.fintech.modelos;

public class Investimento {

    private String data;

    private double rentabilidadeNominal;

    private double valor;

    public Investimento (String dt_data, double vl_rentabilidade_nominal, double vl_valor){
        this.data = dt_data;
        this.rentabilidadeNominal = vl_rentabilidade_nominal;
        this.valor = valor;
    }

    public String getData() { return data;}

    public double getRentabilidadeNominal() { return rentabilidadeNominal;}

    public double getValor() { return valor;}

    public void setData(String data) {
        this.data = data;
    }

    public void setRentabilidadeNominal(double rentabilidadeNominal) {
        this.rentabilidadeNominal = rentabilidadeNominal;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}