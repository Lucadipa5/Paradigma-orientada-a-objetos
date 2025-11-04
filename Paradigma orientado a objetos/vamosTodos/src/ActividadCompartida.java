import java.util.HashSet;

public class ActividadCompartida extends Actividad{
    private int edadMinima;
    public ActividadCompartida(int valor,int edadMinima,Ciudad ciudadAsociada) {
        super(valor,ciudadAsociada);
        this.edadMinima = edadMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int valorTotal(HashSet<Viajero> grupo) {
        return super.getValor()*grupo.size();
    }

    @Override
    public boolean cumplenRequisitos(HashSet<Viajero> grupo) {
        boolean puede = true;
        for (Viajero viajero : grupo) {
            if(viajero.getEdad() < getEdadMinima()){
                puede = false;
            }
        }
    return  puede;
    }

}
