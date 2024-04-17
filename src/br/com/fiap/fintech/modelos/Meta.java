package br.com.fiap.fintech.modelos;

import java.util.Date;

public class Meta {
    // Convenção Java para nomes de variáveis: camelCase
    private int idUser;
    private String nomeMeta;
    private float valorMeta;
    private Date dataInicio;
    private Date dataTermino;

    // Construtor
    public Meta(int idUser, String nomeMeta, float valorMeta, Date dataInicio, Date dataTermino) {
        this.idUser = idUser;
        this.nomeMeta = nomeMeta;
        this.valorMeta = valorMeta;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    // Getters e Setters
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public void setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
    }

    public float getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(float valorMeta) {
        this.valorMeta = valorMeta;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }
}
