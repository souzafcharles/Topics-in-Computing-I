import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstudanteTete {

    @DisplayName("Testar AssertAll")
    @Test
    void CaseTeste01() {
        Estudante estudante = new Estudante("Balthazar", "Bigode");
        assertAll( "estudate",
                () -> assertEquals("Balthazar", estudante.getPrimeiroNome()),
                () -> assertEquals("Bigode", estudante.getUltimoNome())
        );
    }
}
