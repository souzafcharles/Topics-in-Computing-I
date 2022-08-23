import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ClienteTest {
    private  Cliente cli;
    @BeforeAll
    public void inicializa(){
        cli = new Cliente("","", "");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @Tag("ICorreto")
    public void casoTeste1(){
        cli.setNome("Charles");
        assertEquals("Charles",cli.getNome());
    }

    @Test
    @EnabledOnOs({OS.LINUX,OS.WINDOWS})
    @Tag("ICorreto")
    public void casoTeste2(){
        cli.setRg("123");
        assertEquals("123",cli.getRg());
    }

    @Test
    @EnabledOnJre(JRE.JAVA_14)
    @Tag("ACorrigir")
    public void casoTeste3(){
        cli.setEndereco("Rua dos Jabotis");
        assertEquals("Rua dos Jabotis",cli.getEndereco());
    }

    @Test
    @EnabledOnJre(JRE.JAVA_16)
    @Tag("ACorrigir")
    public void casoTeste4(){
        assertTrue(true);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_16)
    @Tag("ACorrigir")
    public void casoTeste5(){
        assertTrue(true);
    }
}