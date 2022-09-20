import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GatoTestes {

    private Gato gato;
    private List<Gato> gatos = new ArrayList<>();

    @BeforeAll
    public void inicializa(){
        gato = new Gato (TipoGato.PRETO, "Balthazar", 2, 6.5);
    }

    @Order(1)
    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Verifica o teste de tres valores de gato de String")
    @ValueSource(strings = {"valor1","valor2", "valor3"})
    public void casoTeste1(String str) {
        Gato gato1 = new Gato(TipoGato.BRANCO, "Ophelia", 2, 4.1);
        Gato gato2 = new Gato(TipoGato.AMARELO, "Bartholomeu", 3, 5.1);
        Gato gato3 = new Gato();
        gato1.setNome(str);
        gato2.setNome(str);
        gato3.setNome(str);
        System.out.println("str: " + str);
        assertEquals(str, gato1.getNome());
        assertEquals(str, gato2.getNome());
        assertEquals(str, gato3.getNome());
    }

    @Order(2)
    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    @DisplayName("Verifica assert All")
    public void casoTeste02(){
        assertAll("gato",
                () -> assertEquals(TipoGato.PRETO, gato.getTipoGato()),
                () -> assertEquals("Balthazar", gato.getNome()),
                () -> assertEquals(2, gato.getIdade()),
                () -> assertEquals(6.5, gato.getPeso())
        );
    }

    @Order(3)
    @ParameterizedTest
    @DisplayName("Verifica a parametrizacao dos testes de gatos")
    @MethodSource("GatosArgumentos")
    public void casoTeste3(TipoGato tipoGato, String nome, Integer idade, Double peso) {
        Gato gatoParametrizado = new Gato(tipoGato, nome, idade, peso);
        Gato gatoCopiado = gato.copia(gatoParametrizado);
        assertEquals(1, gatoCopiado.compara(gatoParametrizado, gatoCopiado ));
    }
    static Stream<Arguments> GatosArgumentos() {
        return Stream.of(
                Arguments.arguments(TipoGato.PRETO, "Balthazar", 2, 6.5),
                Arguments.arguments(TipoGato.BRANCO, "Ophelia", 1, 4.2)
        );
    }

    @Order(4)
    @RepeatedTest(value = 5, name = "{displayName}: #{currentRepetition} gato")
    @DisplayName("Verifica teste de repeticao")
    public void casoTeste4(RepetitionInfo rep) {
        gatos.add(gato);
        assertEquals(rep.getCurrentRepetition(), gatos.size());
    }

    @Order(5)
    @ParameterizedTest
    @EnumSource
    @DisplayName("Verifica o teste de Enum dos tipos de gatos")
    public void casoTeste5(TipoGato tipoGato){
        System.out.println(tipoGato);
        assertEquals(tipoGato,tipoGato);
    }

}

