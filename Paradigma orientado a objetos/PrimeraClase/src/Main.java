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
        Persona alfrodoti = new Persona();// Objeto instacia = new objeto();
        System.out.println("Alfrodoti esta en el piso: " + alfrodoti.pisoActual +
                            " Y quiere ir al piso " + alfrodoti.pisoQueQuieroIr);
        ascensor.ingresa(alfrodoti);
        ascensor.comenzarRecorrido(alfrodoti);
        ascensor.finalizarRecorrido(alfrodoti);
        System.out.println(alfrodoti.pisoActual);

    }}


