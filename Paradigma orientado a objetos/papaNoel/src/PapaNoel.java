import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

public class PapaNoel {

    ArrayList<Domicilio> bloqueados = new ArrayList<>();
    ArrayList<Domicilio> porVisitar = new ArrayList<>();
    ArrayList<Domicilio> visitados = new ArrayList<>();
    HashSet<Habitante> regaloYaEntregado = new HashSet<>();

    public boolean puedeEntrar(Domicilio domicilio){
        return domicilio.isPuedeEntrar();
    }
    public void añadirAvisitar(Domicilio domicilio) throws DomicilioException{
        if(visitados.contains(domicilio)){
        throw new DomicilioException("Ya fue visitado.");
        }
        if(bloqueados.contains(domicilio)){
            throw new DomicilioException("Esta en la lista negra.");
        }
        if(porVisitar.contains(domicilio)){
            throw new DomicilioException("Este domicilio esta en visitados.");
            }
        else  {
            porVisitar.add(domicilio);
            System.out.println("Se añadio el domicilio:"+domicilio);
        }
    }
    public void visitarDomicilio(Domicilio domicilio){
        if(porVisitar.contains(domicilio)){
            for (Habitante habitante : domicilio.habitantes) {
                darRegalo(habitante);
            }
            visitados.add(domicilio);
            porVisitar.remove(domicilio);
        }
    }
    public void darRegalo(Habitante habitante){
        if(habitante.mereceRegalo()){
            regaloYaEntregado.add(habitante);
        }
    }
    public boolean domicilioAburrido(Domicilio domicilio){
        int personasAburridas = 0;
        for (Habitante habitante : domicilio.habitantes) {
            if (!habitante.mereceRegalo()) {
                personasAburridas++;
            }
        }
        return (personasAburridas == domicilio.habitantes.size());
    }
    public void regalarAlPrimero() throws VacioException{
        if(porVisitar.isEmpty()){
            throw new VacioException("La lista esta vacia. Papa noel no regala a nadie :(");
        }
        else{
        visitarDomicilio(porVisitar.getFirst());
            System.out.println("Se visito el primer domicilio.");
    }
    }
    public Habitante habitanteMayor(){
        int edadMayor = 0;
        Habitante mayor = null;
        for (Habitante habitante : regaloYaEntregado) {
            if(habitante.getEdad() > edadMayor){
                edadMayor = habitante.getEdad();
                mayor = habitante;
            }
        }
        return mayor;
    }
public HashSet<Domicilio> aburridoYYaVisitados(){
    HashSet<Domicilio> aburridosYVisitados = new HashSet<>();
    for (Domicilio visitado : visitados) {
        if(domicilioAburrido(visitado)) {
            aburridosYVisitados.add(visitado);
        }
        }
    return aburridosYVisitados;
    }
    public HashSet<Domicilio> aburridoYNoVisitados(){
        HashSet<Domicilio> aburridosYNoVisitados = new HashSet<>();
        for (Domicilio domicilio : porVisitar) {
                aburridosYNoVisitados.add(domicilio);
            }
        return aburridosYNoVisitados;

    }
}