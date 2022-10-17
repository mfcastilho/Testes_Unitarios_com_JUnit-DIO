package one.digitalinnovation.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
   static void configuraConexao(){
        BancoDeDados.iniciarConexao();

    }


    @BeforeAll
    static void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }


    @AfterAll
    static void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();

    }
}
