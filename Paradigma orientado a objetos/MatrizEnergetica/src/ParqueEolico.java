public class ParqueEolico extends  CentralProductora{
    private int cantidadDeGeneradores;
    private int cantidadDeEnegiaDeGeneradores;

    public ParqueEolico(int cantMaxima, Persona propietario, int cantidadDeGeneradores) {
        super(cantMaxima, propietario);
        this.cantidadDeGeneradores = cantidadDeGeneradores;
        this.cantidadDeEnegiaDeGeneradores = 13;
    }

    public void agregarGeneradores(){
        cantidadDeGeneradores++;
    }

    public void sacarGeneradores(){
        cantidadDeGeneradores--;
    }

    private int getCantidadDeEnegiaDeGeneradores() {
        return cantidadDeEnegiaDeGeneradores;
    }

    public int getCantidadDeGeneradores() {
        return cantidadDeGeneradores;
    }

    @Override
    public int getCantidadQueAporta() {
        return (getCantidadDeEnegiaDeGeneradores()*getCantidadDeGeneradores());
    }

    @Override
    public int getNivelDeEmision() {
        return 0;
    }

}
