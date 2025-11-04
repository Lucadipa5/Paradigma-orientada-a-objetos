public class ParqueEolico extends CentralProductora{
    private int cantidadGeneradores;
    private int energiaGenerador;

    public ParqueEolico(int cantidadGeneradores, Persona propietario) {
        super(propietario);
        this.cantidadGeneradores = cantidadGeneradores;
        this.energiaGenerador = 13;
    }

    @Override
    public int getCantidadEnergia() {
        return cantidadGeneradores*energiaGenerador;
    }

    @Override
    public int getNivelDeEmision() {
        return 0;
    }
    public void agregarGenerador(){
        cantidadGeneradores++;
    }
}
