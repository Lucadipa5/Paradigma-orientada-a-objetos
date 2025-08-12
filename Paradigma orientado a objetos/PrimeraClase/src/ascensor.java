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
}
