public class PulseraParaPartidosImportantes extends Pulsera{

    protected PulseraParaPartidosImportantes(Partido partidoAsociado) {
        super(partidoAsociado);
    }

    @Override
    public boolean puedeEntrar() {
        return (getPartidoAsociado().isImportante());
    }
}
