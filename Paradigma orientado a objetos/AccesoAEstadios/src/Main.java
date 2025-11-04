public class Main {
    public static void main(String[] args) {
    Persona EzequielVales = new Persona();
    Persona PolloVignolo = new Persona();
    Persona LucaDiPasquale = new Persona();
    Equipo VillaDalmine = new Equipo(69);
    Equipo AllBoys = new Equipo(69);
    Partido VillaDalmineVSAllboys = new Partido(AllBoys,VillaDalmine,true);
    PulseraDeSocio VillaSocio = new PulseraDeSocio(VillaDalmineVSAllboys,VillaDalmine);
    PulseraDeSocio AllboysSocio = new PulseraDeSocio(VillaDalmineVSAllboys,AllBoys);
    EzequielVales.setPulseraAsociada(AllboysSocio);
    try {
        VillaSocio.puedeEntrar();
    } catch (PartidoException e) {
        System.out.println(("No pudiste entrar porque" + e.getMessage()));
    }
//    System.out.println(EzequielVales.getPulseraAsociada().puedeEntrar());
//    PulseraParaPartidosImportantes PulseraImportanteVilladalmineAllboys = new PulseraParaPartidosImportantes(VillaDalmineVSAllboys);
//    LucaDiPasquale.setPulseraAsociada(PulseraImportanteVilladalmineAllboys);
//    System.out.println(LucaDiPasquale.getPulseraAsociada().puedeEntrar());
//    PulseraParaPeriodistas VillaDalmineAllboysPeriodista = new PulseraParaPeriodistas(VillaDalmineVSAllboys);
//    PolloVignolo.setPulseraAsociada(VillaDalmineAllboysPeriodista);
//    VillaDalmineAllboysPeriodista.verPartido(VillaDalmineVSAllboys);
//    System.out.println((VillaDalmineAllboysPeriodista.getPartidosVistos()));

    }
}