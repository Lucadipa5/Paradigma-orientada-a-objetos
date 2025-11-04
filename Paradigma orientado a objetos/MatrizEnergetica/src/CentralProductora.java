public abstract class CentralProductora {
    private int cantidadQueAporta;
    private int cantMaxima;
    private int nivelDeEmision;
    private Persona propietario;


    public CentralProductora(int cantMaxima, Persona propietario) {
        this.cantMaxima = cantMaxima;
        this.propietario = propietario;
    }

    public abstract int getCantidadQueAporta();

    public abstract int getNivelDeEmision();

    public Persona getPropietario() {
        return propietario;
    }
    public boolean estaExigida(){
        return (getCantidadQueAporta() >= cantMaxima);
    }
}
