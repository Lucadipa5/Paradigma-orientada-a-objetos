import java.util.HashSet;

public class PulseraParaPeriodistas extends Pulsera{
    private HashSet<Partido> partidosVistos = new HashSet<>();

    protected PulseraParaPeriodistas(Partido partidoAsociado) {
        super(partidoAsociado);
    }

    @Override
    public boolean puedeEntrar() {
        return getPartidoAsociado().isTelevisado();
    }

    public HashSet<Partido> getPartidosVistos() {
        return partidosVistos;
    }

    public void verPartido(Partido partido){
        if(puedeEntrar()){
            partidosVistos.add(partido);
        }
    }
}
