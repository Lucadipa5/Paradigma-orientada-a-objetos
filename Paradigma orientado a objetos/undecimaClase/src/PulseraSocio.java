public class PulseraSocio extends Pulsera {
    private Equipo equipoAsociado;

    public PulseraSocio(Partido partido,Equipo equipo) {
        super(partido);
        this.equipoAsociado = equipo;

    }

    public Equipo getEquipoAsociado() {
        return equipoAsociado;
    }
    @Override
    public boolean puedeEntrar(){
        return equipoAsociado == partido.getLocal();
    }

}
