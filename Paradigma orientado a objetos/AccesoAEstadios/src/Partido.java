public class Partido {
    private Equipo local;
    private Equipo visitante;
    private boolean televisado;

    public Partido(Equipo local, Equipo visitante, boolean televisado) {
        this.local = local;
        this.visitante = visitante;
        this.televisado = televisado;
    }
    public boolean isImportante(){
        return visitante.getPuntos() == local.getPuntos();
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public boolean isTelevisado() {
        return televisado;
    }
}
