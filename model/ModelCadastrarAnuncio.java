package model;

import java.util.Calendar;

public class ModelCadastrarAnuncio {
    
    private Integer cod_anuncio;
    private String nome_anuncio;
    private String nome_cliente;
    private Calendar data_inicio;
    private Calendar data_termino;
    private Float investimento_dia;
    private String pesquisa;

    public Integer getCod_anuncio() {
        return cod_anuncio;
    }

    public void setCod_anuncio(Integer cod_anuncio) {
        this.cod_anuncio = cod_anuncio;
    }

    public String getNome_anuncio() {
        return nome_anuncio;
    }

    public void setNome_anuncio(String nome_anuncio) {
        this.nome_anuncio = nome_anuncio;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_termino() {
        return data_termino;
    }

    public void setData_termino(Calendar data_termino) {
        this.data_termino = data_termino;
    }

    public Float getInvestimento_dia() {
        return investimento_dia;
    }

    public void setInvestimento_dia(Float investimento_dia) {
        this.investimento_dia = investimento_dia;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}