import java.util.HashSet;

public class Grupo {
    private HashSet<Persona> grupoDeAmigos = new HashSet<>();


    public void setGrupoDeAmigos(Persona persona) {
        grupoDeAmigos.add(persona);
    }
    public void xd() {
        int presupuestoMaximo = 0;
        for (Persona Persona : grupoDeAmigos) {
            System.out.println(Persona);
        }
    }
    public int presupuestoMaximo() {
        int presupuestoMaximo = 0;
        for (Persona Persona : grupoDeAmigos) {
            presupuestoMaximo += Persona.getCantDinero();
        }
        return presupuestoMaximo;
    }


}