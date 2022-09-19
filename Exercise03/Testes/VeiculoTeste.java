import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class VeiculoTest {
    private Veiculo veiculo;
    private List<Veiculo> veiculos = new ArrayList<>();

    @BeforeAll
    public void inicializa(){
        veiculo = new Veiculo (TipoVeiculo.TERRESTRE,"C12345A", 4, 1.4);
    }

    @Test
    @EnabledOnOs({OS.LINUX,OS.WINDOWS})
    @Tag("ICorreto")
    public void casoTeste1(){
        veiculo.setTipoVeiculo(TipoVeiculo.TERRESTRE);
        assertEquals(TipoVeiculo.TERRESTRE,veiculo.getTipoVeiculo());
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_16)
    @Tag("ICorreto")
    public void casoTeste2() {
        Veiculo cloneVeiculo = veiculo.clona(veiculo);
        assertEquals(1, cloneVeiculo.compara(veiculo, cloneVeiculo));
    }

    @Test
    @EnabledOnJre(JRE.JAVA_14)
    @Tag("ACorrigir")
    public void casoTeste3(){
        veiculo.setChassi("C12345A");
        assertEquals("C12345A",veiculo.getChassi());
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
