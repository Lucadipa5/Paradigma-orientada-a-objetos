//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ascensor ascensorPrimeroDeIndependencia = new ascensor();
        System.out.println(ascensorPrimeroDeIndependencia.isPuertaAbierta());
        System.out.println(ascensorPrimeroDeIndependencia.enQuePisoEstas());
        ascensorPrimeroDeIndependencia.cambiarPisos(10);
        System.out.println(ascensorPrimeroDeIndependencia.enQuePisoEstas());

            Pistola pistola = new Pistola();
            System.out.println("=== Estado inicial ===");
                System.out.println("¿Está recargada?: " + pistola.estaRecargada());
                System.out.println("Cantidad de balas: " + pistola.cuantasBalasTengo());
                System.out.println("¿Está limpia?: " + pistola.estaLimpia());

                System.out.println("\n--- Recargando pistola ---");
                pistola.recargar();
                System.out.println("¿Está recargada?: " + pistola.estaRecargada());
                System.out.println("Cantidad de balas: " + pistola.cuantasBalasTengo());

                System.out.println("\n--- Limpiando pistola ---");
                pistola.limpiar();
                System.out.println("¿Está limpia?: " + pistola.estaLimpia());
            }
        }


