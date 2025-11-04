public class Persona {
    private Pulsera pulsera;
    private boolean puedeEntrar;

    public Persona(Equipo equipo, Pulsera pulsera) {
        this.pulsera = pulsera;
    }
    public boolean isPuedeEntrar(){
        return  pulsera.puedeEntrar();
    }
}
