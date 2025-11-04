public class Partido {
    private Equipo local;
    private Equipo visitante;
    private boolean isTelevisado;

    public Partido(Equipo local, Equipo visitante, boolean isTelevisado) {
        this.local = local;
        this.visitante = visitante;
        this.isTelevisado = isTelevisado;
    }
    public Equipo getLocal(){
        return local;
    }
    public Equipo getVisitante(){
        return visitante;
    }

    public boolean isImportante() {
        return (local.getPuntos() == visitante.getPuntos());
    }

    public boolean isTelevisado() {
        return isTelevisado;
    }

}

