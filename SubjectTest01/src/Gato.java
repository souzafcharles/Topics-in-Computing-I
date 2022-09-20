public class Gato {

    private TipoGato tipoGato;
    private String nome;
    private Integer idade;
    private Double peso;

    public Gato() {
    }

    public Gato(TipoGato tipoGato, String nome, Integer idade, Double peso) {
        this.tipoGato = tipoGato;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public TipoGato getTipoGato() {
        return tipoGato;
    }

    public void setTipoGato(TipoGato tipoGato) {
        this.tipoGato = tipoGato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Gato copia(Gato gato_copiado){
        return new Gato(gato_copiado.getTipoGato(), gato_copiado.getNome(),
                gato_copiado.getIdade(), gato_copiado.getPeso());
    }
    public int compara(Gato gato_comparado1, Gato gato_comparado2){
        if(gato_comparado1.getNome().equals(gato_comparado2.getNome())){
            return 1;
        }else{
            return 0;
        }
    }
}
