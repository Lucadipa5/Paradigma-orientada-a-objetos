public class Main {
    public static void main(String[] args) {
        Persona Ezequiel = new Persona(2131231);
        CentralNuclear c1 = new CentralNuclear(Ezequiel);
        c1.añadirReactor(150);
        c1.añadirReactor(92);
        System.out.println(c1.getCantidadEnergia());
        System.out.println(c1.getNivelDeEmision());
        ParqueEolico p1 = new ParqueEolico(12,Ezequiel);
        System.out.println(p1.getCantidadEnergia());
        System.out.println(p1.getNivelDeEmision());

        Consumidor UADE = new Consumidor(32);
        Consumidor UIA = new Consumidor(89);

        Ciudad Campana = new Ciudad();
        Campana.añadirConsumidor(UADE);
        Campana.añadirConsumidor(UIA);

        System.out.println(Campana.getConsumoTotal());

    }
}