public abstract class Pulsera {
    private Partido partidoAsociado;

    protected Pulsera(Partido partidoAsociado) {
        this.partidoAsociado = partidoAsociado;
    }

    public abstract boolean puedeEntrar();
    public Partido getPartidoAsociado() {
        return partidoAsociado;
    }
}
