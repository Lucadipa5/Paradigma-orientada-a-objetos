public class Main {
    public static void main(String[] args) {
        Persona indioSolari = new Persona(12314414);

        ParqueEolico parqueEolico = new ParqueEolico(100,indioSolari,12);
        parqueEolico.agregarGeneradores();
        parqueEolico.sacarGeneradores();

        Reactor r1 = new Reactor(150);
        Reactor r2 = new Reactor(92);

        CentralNuclear centralNuclear = new CentralNuclear(100,indioSolari);

        centralNuclear.añadirReactor(r1);
        centralNuclear.añadirReactor(r2);
        System.out.println(centralNuclear.getCantidadQueAporta());
        System.out.println(centralNuclear.getNivelDeEmision());

        Consumidor uade = new Consumidor(32);
        Consumidor uca = new Consumidor(123);
        Ciudad campana  = new Ciudad();
        campana.añadirCentrales(centralNuclear);
        campana.añadirCentrales(parqueEolico);
        campana.añadirConsumidores(uade);
        campana.añadirConsumidores(uca);
        System.out.println(campana.consumoDeCiudad());
        System.out.println(campana.isEficiente());
        System.out.println(campana.isSustentable());


    }
}