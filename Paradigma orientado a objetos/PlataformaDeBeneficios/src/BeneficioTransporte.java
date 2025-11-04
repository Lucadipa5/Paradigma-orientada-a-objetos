public class BeneficioTransporte extends Beneficio{
    private int diasNecesarios;

    public BeneficioTransporte(int valor, int diasNecesarios) {
        super(valor);
        this.diasNecesarios = diasNecesarios;
    }

    @Override
    public boolean esValido(Empleado empleado) {
        return (empleado.getDiasPresenciales()>getDiasNecesarios());
    }

    public int getDiasNecesarios() {
        return diasNecesarios;
    }
}
