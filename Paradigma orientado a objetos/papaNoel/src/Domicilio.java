import java.util.HashSet;

public abstract class Domicilio {
    HashSet<Habitante> habitantes = new HashSet<>();
    protected boolean puedeEntrar;

    public Barrio getBarrio() {
        return barrio;
    }

    protected Barrio barrio;

    public boolean isPuedeEntrar() {
        return puedeEntrar;
    }

    public void añadirHabitantes(Habitante habitante){
        habitantes.add(habitante);
    }

}

