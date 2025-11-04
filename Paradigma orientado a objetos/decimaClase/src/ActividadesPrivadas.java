import java.util.HashSet;

public class ActividadesPrivadas extends Actividades {
    private int valorFijo;
    private int maxParticipante;

    public int getMaxParticipante() {
        return maxParticipante;
    }

    public void setMaxParticipante(int maxParticipante) {
        this.maxParticipante = maxParticipante;
    }

    public int getValorFijo() {
        return valorFijo;
    }

    public void setValorFijo(int valorFijo) {
        this.valorFijo = valorFijo;
    }

    public boolean sePuedeRealizar(HashSet<Persona> grupoDeAmigos) {
        return (getMaxParticipante() < grupoDeAmigos.size());
    }
}
