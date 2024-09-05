package com.dnsouzadev.reflections;

import com.dnsouzadev.reflections.refl.Transformator;

import java.lang.reflect.InvocationTargetException;

public class PessoaService {

    // service
    public PessoaDTO list() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Pessoa pessoa = new PessoaRepository().list();
        return new Transformator().transform(pessoa);
    }
}
