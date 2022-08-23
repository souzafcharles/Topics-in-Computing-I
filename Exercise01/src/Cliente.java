public class Cliente {

    private Integer id_cliente;
    private String nome;
    private String cpf;

    public Cliente(Integer id_cliente, String nome, String cpf) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
