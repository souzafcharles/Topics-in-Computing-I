import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Aluguel {

    private Integer id_aluguel;
    private LocalDate data_aluguel;
    private Cliente client;
    private List<DVD> dvds = new ArrayList<>();

    public Aluguel(Integer id_aluguel, LocalDate data_aluguel, Cliente client) {
        this.id_aluguel = id_aluguel;
        this.data_aluguel = data_aluguel;
        this.client = client;
    }

    public Aluguel(int id_aluguel, LocalDateTime of, Cliente cliente, List<DVD> dvds) {
    }

    public void cadastraListaDVD(DVD dvd) {
        this.dvds.add(dvd);
    }

    public void cadastraAluguel(Aluguel aluguel) {

    }

    public Integer getId_aluguel() {
        return id_aluguel;
    }

    public void setId_aluguel(Integer id_aluguel) {
        this.id_aluguel = id_aluguel;
    }

    public LocalDate getData_aluguel() {
        return data_aluguel;
    }

    public void setData_aluguel(LocalDate data_aluguel) {
        this.data_aluguel = data_aluguel;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public List<DVD> getDvds() {
        return dvds;
    }

    public void setDvds(List<DVD> dvds) {
        this.dvds = dvds;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "id_aluguel=" + id_aluguel +
                ", data_aluguel=" + data_aluguel +
                ", client=" + client +
                ", dvds=" + dvds +
                '}';
    }
}
