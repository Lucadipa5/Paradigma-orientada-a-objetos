import java.util.ArrayList;

public class CentralNuclear extends CentralProductora{
    ArrayList<Reactor> reactores = new ArrayList<>();
    private int cantidadDeEmision;
    public CentralNuclear(int cantMaxima, Persona propietario) {
        super(cantMaxima,propietario);
        this.cantidadDeEmision = 41;
    }

    @Override
    public int getCantidadQueAporta() {
        int totalDeAporte = 0;
        for (Reactor reactor : reactores) {
            totalDeAporte +=  reactor.getCantidadDeEnergiaDeReactor();
        }
        return totalDeAporte-5;
    }

    public void añadirReactor(Reactor reactor){
        if(reactores.size()<5){
            reactores.add(reactor);
        }
    }

    @Override
    public int getNivelDeEmision() {
        return reactores.size()*getCantidadDeEmision();
    }

    private int getCantidadDeEmision() {
        return cantidadDeEmision;
    }

}
