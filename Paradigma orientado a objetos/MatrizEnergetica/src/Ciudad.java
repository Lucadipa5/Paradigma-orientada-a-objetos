import java.util.HashSet;

public class Ciudad {
private HashSet<Consumidor> consumidores = new HashSet<>();
private  HashSet<CentralProductora> centrales = new HashSet<>();

    public void añadirConsumidor(Consumidor c1){
        consumidores.add(c1);
    }
    public void añadirCentral(CentralProductora c1){
        centrales.add(c1);
    }


    public int getConsumoTotal() {
       int total = 0;
        for (Consumidor consumidor : consumidores) {
            total = total + consumidor.getCantDeEnergiaConsumida();
        }
        return total;
    }
}
