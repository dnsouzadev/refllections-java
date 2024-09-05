package com.dnsouzadev.reflections;

public class Pessoa {

    public Pessoa(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    private Long id;
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
