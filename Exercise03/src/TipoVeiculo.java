
public enum TipoVeiculo {
    TERRESTRE("terrestre"),
    AQUATICO("aquatico"),
    AEREO("aereo");

    private String tipoVeiculo;

    TipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
}
