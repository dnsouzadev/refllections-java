package com.dnsouzadev.reflections;

import com.dnsouzadev.reflections.refl.Transformator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class TransformatorTest {

    Pessoa pessoa = new Pessoa(1L, "Daniel", "1234");

    @Test
    public void shouldTransform() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Transformator transformator = new Transformator();
        PessoaDTO pessoaDto = transformator.transform(pessoa);

        Assertions.assertInstanceOf(PessoaDTO.class, pessoaDto);
        Assertions.assertEquals(pessoa.getNome(), pessoaDto.getNome());
        Assertions.assertEquals(pessoa.getCpf(), pessoaDto.getCpf());
    }
}
