package one.digitalinnovation.junit;

import one.digitalinnovation.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Amanda Rinaldi", LocalDate.of(1991, 11, 30));
        Assertions.assertEquals(30, pessoa.getIdade());
    }

    @Test
    void validaVerificacaoDeMaiorIdade(){
        Pessoa joaozinho = new Pessoa("João", LocalDate.of(2001, 1, 1));
        Assertions.assertTrue(joaozinho.ahMaiorDeIdade());

        Pessoa joaquim = new Pessoa("Joaquim Castilho", LocalDate.of(2020, 1, 3));
        Assertions.assertFalse(joaquim.ahMaiorDeIdade());

    }
}
