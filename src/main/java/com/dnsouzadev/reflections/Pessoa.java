package com.dnsouzadev.reflections;

public class Pessoa {

    private Long id;
    private String nome;
    private String cpf;

    public Pessoa(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
