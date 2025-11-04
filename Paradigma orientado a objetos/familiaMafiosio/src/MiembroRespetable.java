public class MiembroRespetable extends Persona {

    private int cantTitulos;
    public MiembroRespetable(int puntosDeHonor,int cantTitulos) {
        super(puntosDeHonor);
        this.cantTitulos = cantTitulos;
    }
    @Override
    public int puntosTotales() {
        return this.getPuntosDeHonor() + cantTitulos*10;
    }
    public int getCantTitulos() {
        return cantTitulos;
    }
    @Override
    public boolean isCapo() {
        return (getCantTitulos() > 1 && puntosTotales() > 90);
    }
}
