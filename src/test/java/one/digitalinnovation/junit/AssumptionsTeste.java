package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {


    @Test
    void validarAlgoSomenteNoUsuarioPedro(){
        Assumptions.assumeTrue("Pedro".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    void validarAlgoSomenteNoUsuarioAna(){
        Assumptions.assumeFalse("Pedro".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
