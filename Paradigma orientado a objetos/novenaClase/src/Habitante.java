public abstract class Habitante {
    protected int edad;
    protected Domicilio domicilio;

    public Habitante(int edad, Domicilio domicilio) {
        this.edad = edad;
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return this.edad;
    }

    public Domicilio getDomicilio() {
        return this.domicilio;
    }

    public abstract boolean mereceRegalo();

    public void mudarse(Domicilio d1){
        this.domicilio = d1;
    }
}
