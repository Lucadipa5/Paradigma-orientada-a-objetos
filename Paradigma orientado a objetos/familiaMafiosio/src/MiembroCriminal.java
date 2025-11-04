import java.util.ArrayList;

public class MiembroCriminal extends Persona{
    private ArrayList<Arma> armas = new ArrayList();

    public MiembroCriminal(int puntosDeHonor) {
        super(puntosDeHonor);
    }

    public void setArmas(Arma arma) {
        armas.add(arma);
    }
    public int puntosTotales() {
        int total = this.getPuntosDeHonor();
        for (Arma arma : armas) {
            total += arma.getPuntosDeHonorEnArma();
        }
        return total;
    }
    public boolean todasHeavy(){
        boolean heavy = true;
        for (Arma arma : armas) {
            if(!arma.isHeavy()){
                heavy = false;
                System.out.println("No tiene todas las armas heavy");
            }

        }
    return heavy;
    }

    @Override
    public boolean isCapo() {
        return (puntosTotales() > 110 && todasHeavy());
    }
}
