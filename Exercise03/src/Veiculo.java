public class Veiculo {

    private TipoVeiculo tipoVeiculo;
    private String chassi;
    private Integer numeroRodas;
    private Double potenciaMotor;

    public Veiculo(TipoVeiculo tipoVeiculo, String chassi, Integer numeroRodas, Double potenciaMotor) {
        this.tipoVeiculo = tipoVeiculo;
        this.chassi = chassi;
        this.numeroRodas = numeroRodas;
        this.potenciaMotor = potenciaMotor;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Integer getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(Integer numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public Double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Veiculo clona(Veiculo veiculo_a_ser_clonado){
        return new Veiculo(veiculo_a_ser_clonado.getTipoVeiculo(), veiculo_a_ser_clonado.getChassi(),
                veiculo_a_ser_clonado.getNumeroRodas(), veiculo_a_ser_clonado.potenciaMotor);
    }

    public int compara(Veiculo veiculo_a_ser_comparado1, Veiculo veiculo_a_ser_comparado2){
        if (veiculo_a_ser_comparado1.getChassi().equals(veiculo_a_ser_comparado2.getChassi()))
            return 1;
        return 0;
    }
}
