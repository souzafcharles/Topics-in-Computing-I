public enum TipoGato {
    PRETO("Preto"),
    BRANCO("Branco"),
    CINZA("Cinza"),
    AMARELO("Amarelo");

    private String tipoGato;

    TipoGato(String tipoGato) {
        this.tipoGato = tipoGato;
    }

    public String getTipoGato() {
        return tipoGato;
    }
}
