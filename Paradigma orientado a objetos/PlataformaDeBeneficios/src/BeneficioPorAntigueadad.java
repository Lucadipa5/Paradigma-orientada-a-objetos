public class BeneficioPorAntigueadad extends Beneficio {
    private int antiguedadNecesaria;
    public BeneficioPorAntigueadad(int valor, int antiguedadNecesaria) {
        super(valor);
        this.antiguedadNecesaria = antiguedadNecesaria;
    }

    @Override
    public boolean esValido(Empleado empleado) {
        return (empleado.getAntiguedad() >= getAntiguedadNecesaria());
    }

    public int getAntiguedadNecesaria() {
        return antiguedadNecesaria;
    }
}
