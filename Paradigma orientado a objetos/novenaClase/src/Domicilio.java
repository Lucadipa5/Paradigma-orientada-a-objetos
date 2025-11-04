import java.util.ArrayList;
import java.util.HashSet;

public abstract class Domicilio {
    private int numero;
    protected ArrayList<Habitante> Habitantes = new ArrayList<Habitante>();

    public Domicilio(int numero) {
        this.numero = numero;
    }
    public abstract boolean entrable();

    public int dondeVive(){
        return this.numero;
    }
    public void agregarPersonas(Habitante p1){
        Habitantes.add(p1);
    }
    public int cuantosHabitantes() {
        return Habitantes.size();
    }
}
