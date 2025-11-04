import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Persona Matias = new Persona(1000, 18);
        Persona Nico = new Persona(1000, 19);
        Persona Martin = new Persona(200, 20);
        Grupo Amigos1 = new Grupo();
        Amigos1.setGrupoDeAmigos(Matias);
        Amigos1.setGrupoDeAmigos(Martin);
        Amigos1.setGrupoDeAmigos(Nico);
        System.out.println(Nico.getCantDinero());
        System.out.println(Amigos1.presupuestoMaximo());

    }
}