import java.util.HashSet;

public class FamiliaMafia {
    HashSet<Persona> integrantes = new HashSet<>();
    HashSet<Persona> Capos = new HashSet<>();
    public void insertarFamiliar(Persona persona){
        integrantes.add(persona);
    }
    public void añadirCapos(Persona persona){
        if(persona.isCapo()){
            Capos.add(persona);
        }
    }
    public int puntosDeLaFamilia(){
        int puntos = 0;
        for (Persona integrante : integrantes) {
            puntos = integrante.puntosTotales();
        }
        return puntos;
    }
    public void imprimirCapos(){
        for (Persona capo : Capos) {
            System.out.println(capo);
        }
    }
    public boolean Dosdebiles(){
        return(contarDebiles()>=2);
    }

    public int contarDebiles(){
        int contador = 0;
        for (Persona integrante : integrantes) {
            if(integrante.isDebil()){
                contador++;
            }
       }
        return contador;
    }
}
