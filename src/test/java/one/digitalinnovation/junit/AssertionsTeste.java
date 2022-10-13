package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


//EXEMPLOS PRÁTICOS DE ASSERÇÕES

public class AssertionsTeste {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {-1,5,2,3,10};

        //Asserção para comparar se NÃO são iguais
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);

        //Asserção para comparar arrays
//        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }


    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        //Asserção para verificar se o elemento é nulo
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Adalberto", LocalDate.of(1974, 12, 30));

        //Asserção para verificar se elemento NÃO é nulo
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDiferentes(){

        int numero1 = 52;
        int numero2 = 54;

        Assertions.assertNotEquals(numero1, numero2);
    }


}
