public abstract class Persona {
    protected int puntosDeHonor;
    private boolean isDebil;
    private boolean isCapo;

    public Persona(int puntosDeHonor) {
        this.puntosDeHonor = puntosDeHonor;
    }

    public int getPuntosDeHonor(){
        return puntosDeHonor;
    }
    public abstract int puntosTotales();

    public boolean isDebil() {
        return (puntosTotales() < 50);
    }
    public abstract boolean isCapo();
}
