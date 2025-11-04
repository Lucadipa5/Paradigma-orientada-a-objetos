import java.util.ArrayList;

public class BeneficioNoAcumulable extends Beneficio {
    private int cantMaxima;
    private Beneficio beneficioIncompatible;
    public BeneficioNoAcumulable(int valor, int cantMaxima) {
        super(valor);
        this.cantMaxima = cantMaxima;
    }

    @Override
    public boolean esValido(Empleado empleado) {
        return (getCantMaxima() > contarBeneficios(empleado));
    }

    public int getCantMaxima() {
        return cantMaxima;
    }

    public int contarBeneficios(Empleado empleado){
        int contador = 0;
        for (Beneficio beneficio1 : empleado.beneficiosYaCanjeados()) {
            if(beneficio1 == this){
                contador++;
            }
        }
        return contador;
    }
}
