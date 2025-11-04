public abstract class Habitante {
    protected int edad;

    public Habitante(int edad) {
        this.edad = edad;
    }

    public abstract boolean mereceRegalo();

    public int getEdad() {
        return edad;
    }
}
