import java.util.HashSet;

public class Ciudad {
    private HashSet<Consumidor> consumidoresDeEnergia = new HashSet<>();
    private HashSet<CentralProductora> productoras = new HashSet<>();

    public int consumoDeCiudad(){
        int cant = 0;
        for (Consumidor consumidor : consumidoresDeEnergia) {
            cant += consumidor.getCantidadQueConsume();
        }
        return cant;
    }

    public void añadirConsumidores(Consumidor consumidor){
        consumidoresDeEnergia.add(consumidor);
    }
    public void añadirCentrales(CentralProductora centralProductora){
        productoras.add(centralProductora);
    }

    public HashSet<Persona> propietariosDeUnaciudad(Ciudad ciudad){
        HashSet<Persona> propietarios = new HashSet<>();
        for (CentralProductora centralProductora : productoras) {
           propietarios.add(centralProductora.getPropietario());
        }
        return propietarios;
    }

    private int cantDeProduccion(){
        int cant = 0;
        for (CentralProductora productora : productoras) {
            cant += productora.getCantidadQueAporta();
        }
        return cant;
    }
    private int cantEmisionCiudad(){
        int cant = 0;
        for (CentralProductora productora : productoras) {
            cant += productora.getNivelDeEmision();
        }
        return cant;
    }

    public boolean isEficiente(){
        return (82 > cantEmisionCiudad());
    }

    public boolean isSustentable(){
        return (cantDeProduccion() > consumoDeCiudad());
    }
    public boolean posiblementePeligrosa(){
        boolean peligrosa = false;
        for (CentralProductora productora : productoras) {
            if (productora.estaExigida()){
                peligrosa = true;
            }
        }
        return peligrosa;
    }
}
