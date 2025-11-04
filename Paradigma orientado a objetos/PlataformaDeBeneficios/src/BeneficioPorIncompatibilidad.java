public class BeneficioPorIncompatibilidad extends Beneficio{
    private Beneficio beneficioIncompatible;

    public BeneficioPorIncompatibilidad(int valor,Beneficio beneficioIncompatible) {
        super(valor);
        this.beneficioIncompatible = beneficioIncompatible;
    }

    @Override
    public boolean esValido(Empleado empleado) {
        return ((empleado.beneficiosYaCanjeados().contains(beneficioIncompatible)));
    }

}

