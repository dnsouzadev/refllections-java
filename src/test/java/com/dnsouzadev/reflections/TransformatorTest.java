package com.dnsouzadev.reflections;

import com.dnsouzadev.reflections.refl.Transformator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class TransformatorTest {

    Pessoa pessoa = new Pessoa(1L, "Daniel", "1234");
    Pessoa pessoa2 = new Pessoa(2L, "Daniel");
    Endereco endereco = new Endereco("Rua 1", 123);

    @Test
    public void shouldTransform() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Transformator transformator = new Transformator();
        PessoaDTO pessoaDto = transformator.transform(pessoa);

        Assertions.assertInstanceOf(PessoaDTO.class, pessoaDto);
        Assertions.assertEquals(pessoa.getNome(), pessoaDto.getNome());
        Assertions.assertEquals(pessoa.getCpf(), pessoaDto.getCpf());
    }

    @Test
    public void shouldNotTransform() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Assertions.assertThrows(ClassNotFoundException.class, () -> {
            Transformator transformator = new Transformator();
            transformator.transform(endereco);
        });
    }

    @Test
    public void shouldTransformWhenSomeFieldIsNull() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Transformator transformator = new Transformator();
        PessoaDTO pessoaDto = transformator.transform(pessoa2);

        Assertions.assertInstanceOf(PessoaDTO.class, pessoaDto);
        Assertions.assertEquals(pessoa.getNome(), pessoaDto.getNome());
        Assertions.assertNull(pessoaDto.getCpf());
    }
}
