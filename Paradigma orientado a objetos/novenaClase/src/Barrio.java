import java.util.HashSet;

public class Barrio {
    private HashSet<Domicilio> Barrio = new HashSet<Domicilio>();
    
    public int cantDelBarrio(){
        int habitantes = 0;
        for (Domicilio domicilio : Barrio) {
            habitantes = domicilio.cuantosHabitantes();
        }
        return habitantes;
    }



}
