package com.dnsouzadev.reflections;

public class PessoaService {

    // service
    public PessoaDTO list() {
        PessoaRepository pessoaRepository = new PessoaRepository();
        Pessoa pessoa = pessoaRepository.list();
        return new PessoaDTO(pessoa.getNome(), pessoa.getCpf());
    }
}
