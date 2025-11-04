import java.util.HashSet;

public class PulseraPeriodista extends Pulsera {
    private HashSet<Partido> partidoIdos = new HashSet<>();

    public PulseraPeriodista(Partido partido) {
        super(partido);
    }

    public boolean ingresoElPeriodista(Partido partido) {
        for (Partido partidoIdo : partidoIdos) {
            if(partido == partidoIdo){
             return true;
            }
        }
        return false;
    }

    @Override
    public boolean puedeEntrar() {
        agregarPartidoIdos(partido);
        return partido.isTelevisado();
    }

    public void agregarPartidoIdos(Partido partido) {
        partidoIdos.add(partido);
    }
}
