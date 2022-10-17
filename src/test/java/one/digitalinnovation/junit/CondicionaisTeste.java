package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Pedro")
    void validarAlgoSomenteNoUsuarioPedro(){

        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoSeUsuarioRoot(){

        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoDoUsuario(){

        Assertions.assertEquals(10, 5+5);
    }



}
