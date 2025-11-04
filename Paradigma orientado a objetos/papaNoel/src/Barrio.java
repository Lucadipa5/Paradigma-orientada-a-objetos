import java.util.HashSet;

public class Barrio {
    private int cantDeHabintantes;
    HashSet<Domicilio> domicilios = new HashSet<>();

    public void añadirDomicilio(Domicilio domicilio){
        domicilios.add(domicilio);
    }
}
