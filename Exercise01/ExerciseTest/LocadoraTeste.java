import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LocadoraTeste {

    private static DVD dvd01;
    private static DVD dvd02;

    private static List<DVD> dvds = new ArrayList<>();
    private static Cliente cliente;
    private static Aluguel aluguel;
    private static List<Aluguel> alugueis = new ArrayList<>();
    private static Locadora locadora;

    @BeforeAll
    public static void inicializaObjeto(){
        dvd01 = new DVD(100, "Titanic", "Na porta cabiam duas pessoas");
        dvd02 = new DVD(200, "StarWars", "Numa galáxia muito distante...");
        
        dvds.add(dvd01);
        dvds.add(dvd02);
        cliente = new Cliente(100, "Balthazar de Bigode", "111.222.333-44");
        aluguel = new Aluguel(100, LocalDateTime.of(2022, 8, 07, 23, 55), cliente, dvds);
        alugueis.add(aluguel);
        locadora = new Locadora(alugueis);
    }

    @Test
    @DisplayName("Testa o construtor e o getCpf")
    public void caseTest01(){
        assertEquals("111.222.333-44", cliente.getCpf());
    }

    @Test
    @DisplayName("Testa o construtor e o getNome")
    public void caseTest02(){
        dvd01.setNome("Titanic");
        assertEquals("Titanic", dvd01.getNome());
    }

    @Test
    @DisplayName("Testa os métdos de acesso")
    public void casoTeste03(){
        dvd02.setNome("StarWars");
        dvd02.setId_dvd(200);
        assertAll("descrição dos casos de test",
                () -> assertEquals("StarWars",dvd02 .getNome()),
                () -> assertEquals(0,dvd02.setId_dvd(200)),
                () -> assertEquals("Numa galáxia muito distante...",dvd02.getDescrição())
        );
    }

}
