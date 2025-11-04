public class Main {
    public static void main(String[] args) {
        Pan panDePapa = new Pan(4500);
        Medallon medallonDePollo = new Medallon(1500);
        Medallon medallonDeCarne = new Medallon(2900);
        Medallon medallonVegetariano = new Medallon(1890);
        Adicional cheddar = new Adicional(600);
        Adicional berenjena = new Adicional(350);
        Hamburguesa h1 = new Hamburguesa(panDePapa);
        h1.setMedallones(medallonDeCarne);
        h1.setMedallones(medallonDePollo);
        h1.setAdicionales(cheddar);
        h1.setAdicionales(berenjena);
        System.out.println(h1.isFacturable());

    }
}