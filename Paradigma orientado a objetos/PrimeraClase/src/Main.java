public class Main {
    public static void main(String[] args) {
        ascensor ascensor = new ascensor();
        //            Pistola pistola = new Pistola();
//            System.out.println("=== Estado inicial ===");
//                System.out.println("¿Está recargada?: " + pistola.estaRecargada());
//                System.out.println("Cantidad de balas: " + pistola.cuantasBalasTengo());
//                System.out.println("¿Está limpia?: " + pistola.estaLimpia());
//
//                System.out.println("\n--- Recargando pistola ---");
//                pistola.recargar();
//                System.out.println("¿Está recargada?: " + pistola.estaRecargada());
//                System.out.println("Cantidad de balas: " + pistola.cuantasBalasTengo());
//
//                System.out.println("\n--- Limpiando pistola ---");
//                pistola.limpiar();
//                System.out.println("¿Está limpia?: " + pistola.estaLimpia());
//            }
        Persona Alfrodoti = new Persona();// Objeto instacia = new objeto();
        Persona Matias = new Persona();
        System.out.println("Alfrodoti esta en el piso: " + Alfrodoti.pisoActual +
                " Y quiere ir al piso " + Alfrodoti.pisoQueQuieroIr);
        ascensor.ingresa(Alfrodoti);
        ascensor.comenzarRecorrido(Alfrodoti);
        ascensor.finalizarRecorrido(Alfrodoti);
        System.out.println(Alfrodoti.pisoActual);

        Pulsera PulseraNegra = new Pulsera();
        PulseraNegra.asignarPrecio(10000);
        Pulsera PulseraRoja = new Pulsera();
        PulseraRoja.asignarPrecio(5000);
        Pulsera PulseraVerde = new Pulsera();
        PulseraVerde.asignarPrecio(0);
        Pulsera PulseraAzul = new Pulsera();
        PulseraAzul.asignarPrecio(3000);

        Alfrodoti.asignarPulsera(PulseraAzul);
        Matias.asignarPulsera(PulseraVerde);
        System.out.println(Alfrodoti.pulsera.cuantoPaga());
        Alfrodoti.intercambiarPulseras(Matias);
        System.out.println(Alfrodoti.pulsera.cuantoPaga());

        System.out.println(Matias.pulsera.cuantoPaga() == Alfrodoti.pulsera.cuantoPaga());


    }}


