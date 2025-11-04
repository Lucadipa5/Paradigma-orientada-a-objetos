import java.util.ArrayList;

public class Paquete {
    private ArrayList<Ciudad> ciudades = new ArrayList<>();
    private int tarifaPorDia;
    private ArrayList<Actividad> actividades = new ArrayList<>();
    private GrupoDeAmigos grupoDeAmigos;
    public Paquete(){
        this.tarifaPorDia = 36;
    }

    public void setActividads(Actividad actividad) {
        if(ciudades.contains(actividad.getCiudadAsociada()) && actividad.cumplenRequisitos(grupoDeAmigos.getGrupo())){
            actividades.add(actividad);
    }
        else{
            throw new CiudadExeption("No puedes añadirla por que no estar en el paquete");
        }
    }
    public void setCiudades(Ciudad ciudad) {
        ciudades.add(ciudad);
    }
    public void añadirGrupo(GrupoDeAmigos grupoDeAmigos){
        this.grupoDeAmigos = grupoDeAmigos;
    }
    public int precioPaquete(){
     return precioCiudad() + precioActividades() + (getTarifaPorDia()*getDiasDeEstancia());
    }
    public int precioCiudad(){
        int precio = 0;
        for (Ciudad ciudad : ciudades) {
            precio += (ciudad.getTasaTurista());
        }
        return precio*grupoDeAmigos.getGrupo().size();
    }
    public int getTarifaPorDia() {
        return (tarifaPorDia*grupoDeAmigos.getGrupo().size());
    }
    public int precioActividades(){
        int precio = 0;
        for (Actividad actividad : actividades) {
            precio += actividad.valorTotal(this.grupoDeAmigos.getGrupo());
        }
        return precio;
        }

    public int getDiasDeEstancia(){
        int contador = 0;
        for (Ciudad ciudad : ciudades) {
           contador += ciudad.getDiasDeEstancia();
        }
        return contador;
    }
    public boolean isPagable(){
       return grupoDeAmigos.getPresupuestoMaximo() >= precioPaquete();
    }
    
    public Actividad actividadMasCara(){
        int precioCaro = 0;
        Actividad cara = null;
        for (Actividad actividad : actividades) {
            if (actividad.getValor() > precioCaro) {
                cara = actividad;
            }
        }
        return cara;
    }

    }


