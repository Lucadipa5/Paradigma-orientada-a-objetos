public class Main {
    public static void main(String[] args) {
        BeneficioTransporte Subte = new BeneficioTransporte(1000, 3);
        BeneficioPorAntigueadad viajeEuropa = new BeneficioPorAntigueadad(400, 30);
        BeneficioNoAcumulable vacacionesExtras = new BeneficioNoAcumulable(10, 3);
        BeneficioPorIncompatibilidad semanaExtra = new BeneficioPorIncompatibilidad(100,vacacionesExtras);
        Empleado Fernando = new Empleado(30, 1, 10000);

        System.out.println("Beneficio Transporte:");
        System.out.println(Subte.esValido(Fernando));
        Fernando.canjearBeneficio(Subte);
        System.out.println("Beneficio Transporte:");

        System.out.println(viajeEuropa.esValido(Fernando));
        Fernando.canjearBeneficio(viajeEuropa);
        System.out.println(vacacionesExtras.esValido(Fernando));
        Fernando.canjearBeneficio(vacacionesExtras);
        Fernando.canjearBeneficio(vacacionesExtras);
        Fernando.canjearBeneficio(vacacionesExtras);
        System.out.println(vacacionesExtras.esValido(Fernando));
        Fernando.canjearBeneficio(vacacionesExtras);

        System.out.println(semanaExtra.esValido(Fernando));
        System.out.println("Mayor");
        System.out.println(Fernando.beneficioMayor());
        System.out.println("Lista");
        Fernando.mostrarLista();


    }
}