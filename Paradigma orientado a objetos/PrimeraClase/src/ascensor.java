public class ascensor {
    private boolean puertaAbierta = true;
    private int pisoActual = 0;
    private int cantPersonas;

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }
    public void cambiarPisos(int piso){
        pisoActual = piso;
        this.cerrarPuerta();
    }
    public void abrirPuerta(){
        puertaAbierta = true;
    }
    public void cerrarPuerta(){
        puertaAbierta = false;
    }
    public int enQuePisoEstas(){
        return pisoActual;
    }
    public void ingresa(Persona persona){
        pisoActual = persona.pisoActual;
        persona.alfroInAscensor = true;
    }
    public void comenzarRecorrido(Persona persona){
        puertaAbierta = false;
        cambiarPisos(persona.pisoQueQuieroIr);
    }
    public void finalizarRecorrido(Persona persona){
        persona.alfroInAscensor = false;
        persona.pisoActual = persona.pisoQueQuieroIr;
        pisoActual = persona.pisoQueQuieroIr;
    }
}
