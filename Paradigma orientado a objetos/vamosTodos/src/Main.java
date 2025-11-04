public class Main {
    public static void main(String[] args) {
    Viajero Matias  = new Viajero(21);
    Viajero Nicolas  = new Viajero(21);
    Viajero X =new Viajero(23);
    GrupoDeAmigos g1 = new GrupoDeAmigos(2200);
    g1.añadirAlGrupo(Matias);
    g1.añadirAlGrupo(Nicolas);
    g1.añadirAlGrupo(X);
    Ciudad BuenosAires = new Ciudad(0,2);
    Ciudad Mendoza = new Ciudad(7,2);
    Ciudad Bariloche  = new Ciudad(0,3);
    ActividadCompartida cataDeVinos = new ActividadCompartida(245,18,Mendoza);
    ActividadPrivada paseoEnVelero = new ActividadPrivada(720,6,BuenosAires);
    Paquete paquete = new Paquete();
    paquete.añadirGrupo(g1);
    paquete.setCiudades(BuenosAires);
    paquete.setCiudades(Mendoza);
    paquete.setCiudades(Bariloche);

    try {
    paquete.setActividads(cataDeVinos);
    paquete.setActividads(paseoEnVelero);
    } catch (CiudadExeption e) {
        System.out.println("No se pudo añadir porque: " + e.getMessage());
    }
        System.out.println( paquete.precioPaquete());
        System.out.println(paquete.isPagable());
    }

}