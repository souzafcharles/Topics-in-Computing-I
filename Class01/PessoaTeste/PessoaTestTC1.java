import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTestTC1 {
    public static Pessoa p1;
    @BeforeAll
    public static void inicializaObjeto(){
        p1 = new Pessoa("123","José");
    }

    @Test
    @DisplayName("Testa o construtor e o getCpf")
    public void casoTeste1(){
        assertEquals("123",p1.getCpf());
    }

    @Test
    @DisplayName("Testa os métodos setNome e getNome")
    public void casoTeste2(){
        p1.setNome("Maria de Nazaré");
        assertEquals("Maria de Nazaré",p1.getNome());
    }

    @Test
    @DisplayName("Testa todos os métodos get e set")
    public void casoTeste3(){
        p1.setNome("Renatinho");
        p1.setCpf("xpto");
        assertAll("descrição dos casos de test",
                () -> assertEquals("Renatinho",p1.getNome()),
                () -> assertEquals("xpto",p1.getCpf()),
                () -> assertEquals(2,p1.getMatricula()),
                () -> assertEquals(1,p1.getIdade())
        );
    }
}