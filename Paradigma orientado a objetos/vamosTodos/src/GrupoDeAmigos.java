import java.util.HashSet;

public class GrupoDeAmigos {
    private HashSet<Viajero> grupo = new HashSet<>();
    private int presupuestoMaximo;

    public GrupoDeAmigos(int presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }

    public HashSet<Viajero> getGrupo() {
        return grupo;
    }

    public void añadirAlGrupo(Viajero viajero) {
        grupo.add(viajero);
    }
    public void sacarDelGrupo(Viajero viajero) {
        grupo.remove(viajero);
    }

    public void setPresupuestoMaximo(int presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }

    public int getPresupuestoMaximo() {
        return presupuestoMaximo;
    }
}
