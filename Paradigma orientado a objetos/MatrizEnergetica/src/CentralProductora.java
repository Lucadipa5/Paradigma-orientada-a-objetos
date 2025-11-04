public abstract class CentralProductora {
    private int cantidadEnergia;
    private int cantidadMaxima;
    private int nivelDeEmision;
    private Persona propietario;

    public CentralProductora(Persona propietario) {
        this.propietario = propietario;
    }

    public abstract int getCantidadEnergia();

    public abstract int getNivelDeEmision();
}
