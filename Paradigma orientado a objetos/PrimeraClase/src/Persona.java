public class Persona {
    public int pisoActual = 8;
    public int pisoQueQuieroIr = 24;
    public boolean alfroInAscensor = false;
    public Pulsera pulsera;

    public int pisoAlfrodoti(){
        return pisoActual;
    }
    public void asignarPulsera(Pulsera pulsera){
       this.pulsera = pulsera;
    }
    public void intercambiarPulseras(Persona a){
         Pulsera aux = a.pulsera;
        a.pulsera = this.pulsera;
        this.pulsera = aux;
    }
}
