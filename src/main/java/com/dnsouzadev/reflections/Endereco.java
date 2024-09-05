package com.dnsouzadev.reflections;

public class Endereco {

    public Endereco(String rua, Integer numero) {
        this.rua = rua;
        this.numero = numero;
    }

    private String rua;
    private Integer numero;

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
    }
}
