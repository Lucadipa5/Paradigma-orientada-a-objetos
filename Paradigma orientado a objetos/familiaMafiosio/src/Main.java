public class Main {
    public static void main(String[] args) {
        FamiliaMafia Sopranos = new FamiliaMafia();
        MiembroCriminal TonySoprano = new MiembroCriminal(10);

        MiembroCriminal Christopher = new MiembroCriminal(1);
        MiembroCriminal Pussy = new MiembroCriminal(1);
        MiembroRespetable Silvio = new MiembroRespetable(10,17);
        Sopranos.insertarFamiliar(TonySoprano);
        Sopranos.insertarFamiliar(Silvio);
        Sopranos.insertarFamiliar(Christopher);
        Sopranos.insertarFamiliar(Pussy);
        Ametralladora AK47 = new Ametralladora(110);
        Cuchillo Mariposa = new Cuchillo(1);
        TonySoprano.setArmas(AK47);
        Christopher.setArmas(Mariposa);
        Pussy.setArmas(Mariposa);
        Sopranos.añadirCapos(TonySoprano);
        Sopranos.añadirCapos(Silvio);
        Sopranos.añadirCapos(Christopher);
        Sopranos.añadirCapos(Pussy);


//Arma heavy
        System.out.println("El arma AK47 es heavy:" + AK47.isHeavy());
//Honor de un integrante
        System.out.println("Puntos de Tony Soprano:" + TonySoprano.puntosTotales());
//es un integrante capo
        System.out.println("Es tony soprano capo?"+TonySoprano.isCapo() +"OBVIO");
//Los capos de una familia
        System.out.println("Los capos de los sopranos son: " );
        Sopranos.imprimirCapos();
//Puntos familia
        System.out.println("Puntos de los sopranos" + Sopranos.puntosDeLaFamilia());
//Hay al menos 2 debiles?
        System.out.println("Hay al menos 2 debiles"+ Sopranos.Dosdebiles());
        System.out.println(Sopranos.contarDebiles());
    }
}