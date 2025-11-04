public abstract class Pulsera {
    Partido partido;

    public Pulsera(Partido partido) {
        this.partido = partido;
    }
    public abstract boolean puedeEntrar();
}
