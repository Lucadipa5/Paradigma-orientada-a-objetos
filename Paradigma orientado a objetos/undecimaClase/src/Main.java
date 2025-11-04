public class Main {
    public static void main(String[] args) {
        Equipo DeportivoSanJose = new Equipo(69);
        Equipo DeportivoSantamaria = new Equipo(69);
        Partido parti1 = new Partido(DeportivoSantamaria,DeportivoSanJose,true);
        PulseraImportante p1 = new PulseraImportante(parti1);
        PulseraSocio p2 = new PulseraSocio(parti1,DeportivoSanJose);
        PulseraSocio p3 = new PulseraSocio(parti1,DeportivoSantamaria);
        PulseraPeriodista p4 = new PulseraPeriodista(parti1);
//Periodista
        System.out.println("Periodista: ");
        System.out.println(p4.puedeEntrar());
        System.out.println(p4.ingresoElPeriodista(parti1));

//Socio
        System.out.println("Socio: ");
        System.out.println(p2.puedeEntrar());
        System.out.println(p3.puedeEntrar());

//Importante
        System.out.println("Importante: ");
        System.out.println(p1.puedeEntrar());


    }
}