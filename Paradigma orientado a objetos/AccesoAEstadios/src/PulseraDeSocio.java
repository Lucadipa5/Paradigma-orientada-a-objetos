public class PulseraDeSocio extends Pulsera{
    private Equipo equipoAsociado;

    public PulseraDeSocio(Partido partidoAsociado,Equipo equipoAsociado) {
        super(partidoAsociado);
        this.equipoAsociado = equipoAsociado;
    }

    public Equipo getEquipoAsociado() {
        return equipoAsociado;
    }

    @Override
    public boolean puedeEntrar() {
        boolean puede = true;
            if (getPartidoAsociado().getLocal() == getEquipoAsociado()){
                puede = true;
            }
            else{
            puede = false;
            throw new PartidoException(" No estas de local");
            }
        return puede;
    }
}
