public class DVD {
    private Integer id_dvd;
    private String nome;
    private String descrição;

    public DVD(Integer id_dvd, String nome, String descrição) {
        this.id_dvd = id_dvd;
        this.nome = nome;
        this.descrição = descrição;
    }

    public Integer getId_dvd() {
        return id_dvd;
    }

    public byte setId_dvd(Integer id_dvd) {
        this.id_dvd = id_dvd;
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "id_dvd=" + id_dvd +
                ", nome='" + nome + '\'' +
                ", descrição='" + descrição + '\'' +
                '}';
    }
}
