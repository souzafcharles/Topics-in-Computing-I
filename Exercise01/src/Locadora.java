import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Aluguel> alugueis = new ArrayList<>();

    public Locadora(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }


    public void cadastraAluguel(Cliente cliente, DVD dvd , Aluguel data_aluguel){

    }

    public byte procuraAluguel(Integer id_aluguel){

        return 0;
    }

    @Override
    public String toString() {
        return "Locadora{" +
                "alugueis=" + alugueis +
                '}';
    }
}
