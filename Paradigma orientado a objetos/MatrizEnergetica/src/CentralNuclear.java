import java.util.ArrayList;

public class CentralNuclear extends CentralProductora{
    private ArrayList<Reactor> reactores = new ArrayList<>();
    private int cantEmision;

    public CentralNuclear(Persona propietario) {
        super(propietario);
        this.cantEmision = 41;
    }

    @Override
    public int getCantidadEnergia() {
        int cantidad = 0;
        for (Reactor reactor : reactores) {
            cantidad = cantidad + reactor.getEnergia();
        }
        return (cantidad-5);
    }
    public void añadirReactor(int energia){
        if(reactores.size()<5){
            reactores.add(new Reactor(energia)); // DUda aca, por que tengo que poner new??
        }
    }


    public int getCantEmision() {
        return cantEmision;
    }

    @Override
    public int getNivelDeEmision() {
        return reactores.size()*getCantEmision();
    }
}
