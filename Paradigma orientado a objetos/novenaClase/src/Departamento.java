import java.util.HashSet;

public class Departamento extends Domicilio{
    private boolean ventanasAbiertas;
    private int piso;

    public Departamento(int numero, boolean ventanasAbiertas, int piso) {
        super(numero);
        this.ventanasAbiertas = ventanasAbiertas;
        this.piso = piso;
    }

    public void abrirVentanas(){
        this.ventanasAbiertas = true;
    }

    public void cerrarVentaneas(){
        this.ventanasAbiertas = false;
    }
}
