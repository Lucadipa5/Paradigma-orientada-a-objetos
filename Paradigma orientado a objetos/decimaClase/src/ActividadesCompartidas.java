import java.util.HashSet;

public class ActividadesCompartidas extends Actividades {
    private int precioPorPersona;
    private int edadMaxima;

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public int getPrecioPorPersona() {
        return precioPorPersona;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public void setPrecioPorPersona(int precioPorPersona) {
        this.precioPorPersona = precioPorPersona;

    }
    public boolean sePuedeRealizar(HashSet<Persona> grupoDeAmigos){
        for (Persona persona : grupoDeAmigos) {
            if(persona.getEdad() < edadMaxima);
            return false;
        }
        return true;
    }

}
