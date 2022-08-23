import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    private static Cliente cli;
    @BeforeAll
    public static void inicializa(){
        cli = new Cliente("","");
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void casoTeste1(){
        cli.setNome("Charles");
        assertEquals("Charles",cli.getNome());

    }

    @Test
    @EnabledOnOs({OS.LINUX,OS.WINDOWS})
    public void casoTeste2(){
        cli.setRg("123");
        assertEquals("123",cli.getRg());
    }
}