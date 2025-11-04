import java.util.HashSet;

public abstract class Actividad {
    private int valor;
    private Ciudad ciudadAsociada;

    public Actividad(int valor,Ciudad ciudadAsociada) {
        this.valor = valor;
        this.ciudadAsociada = ciudadAsociada;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Ciudad getCiudadAsociada() {
        return ciudadAsociada;
    }
    public abstract boolean cumplenRequisitos(HashSet<Viajero> grupo);
    public abstract int valorTotal(HashSet<Viajero> grupo);

}
