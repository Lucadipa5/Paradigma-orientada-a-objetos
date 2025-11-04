public class PulseraImportante extends Pulsera {
    public PulseraImportante(Partido partido) {
        super(partido);
    }

    public boolean puedeEntrar() {
        return partido.isImportante();
    }
}
