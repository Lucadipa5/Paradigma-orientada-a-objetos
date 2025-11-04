import java.util.HashSet;

public class ActividadPrivada extends Actividad{
    private int maximosParticipantes;

    public ActividadPrivada(int valor, int maximosParticipantes,Ciudad ciudadAsociada) {
        super(valor,ciudadAsociada);
        this.maximosParticipantes = maximosParticipantes;
    }

    public int getMaximosParticipantes() {
        return maximosParticipantes;
    }


    @Override
    public boolean cumplenRequisitos(HashSet<Viajero> grupo) {
        return grupo.size() <= getMaximosParticipantes();
    }

    @Override
    public int valorTotal(HashSet<Viajero> grupo) {
        return super.getValor();
    }

}
