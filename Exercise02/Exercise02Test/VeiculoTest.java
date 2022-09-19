import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
    @EnabledOnOs({OS.WINDOWS})
    @Tag("ICorreto")
    public void casoTeste1(){
        veiculo.setTipoVeiculo(TipoVeiculo.TERRESTRE);
        assertEquals(TipoVeiculo.TERRESTRE,veiculo.getTipoVeiculo());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Verifica o teste de dois valores de String")
    @ValueSource(strings = {"valor1","valor2"})
    public void casoTeste2(String str){
        Veiculo veiculo = new Veiculo(TipoVeiculo.TERRESTRE,"12345A", 4, 2.2);
        veiculo.setChassi(str);
        System.out.println("str: "+str);
        assertEquals(str,veiculo.getChassi());
    }

    @ParameterizedTest
    @DisplayName("Verifica a parametrização dos testes de veiculos")
    @MethodSource("VeiculosArgumentos")
    public void casoTeste2(TipoVeiculo tipoVeiculo, String chassis, Integer numeroRodas, Double potenciaMotor) {
        Veiculo veiculoParametrizado = new Veiculo(tipoVeiculo, chassis, numeroRodas, potenciaMotor);
        Veiculo veiculoClonado = veiculo.clona(veiculoParametrizado);
        assertEquals(1, veiculoClonado.compara(veiculoParametrizado, veiculoClonado));
    }
    static Stream<Arguments> VeiculosArgumentos() {
        return Stream.of(
                Arguments.arguments(TipoVeiculo.AEREO, "123456M", 4, 1000000.0),
                Arguments.arguments(TipoVeiculo.AQUATICO, "I8526987", 0, 2000.0)
        );
    }

    @ParameterizedTest
    @EnumSource
    @DisplayName("Verifica o teste de Enum")
    public void casoTeste3(TipoVeiculo tipoVeiculo){
        System.out.println(tipoVeiculo);
        assertEquals(tipoVeiculo,tipoVeiculo);
    }

    @RepeatedTest(value = 5, name = "{displayName}: #{currentRepetition} veiculo")
    @DisplayName("Verifica teste de repetição")
    public void casoTeste4(RepetitionInfo rep) {
        veiculos.add(veiculo);
        assertEquals(rep.getCurrentRepetition(), veiculos.size());
    }
}
