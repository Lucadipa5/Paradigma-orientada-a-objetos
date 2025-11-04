public class Main {
    public static void main(String[] args) {
    Casa casa1 = new Casa();
    Casa casa2 = new Casa();
    Departamento departamento1 = new Departamento();
    departamento1.abrirVentana();
    Barrio VillaLaAngostura = new Barrio();
    VillaLaAngostura.añadirDomicilio(casa1);
    PapaNoel viejitoPasquaero = new PapaNoel();
    Humano Martin = new Humano(23);
    Humano Melina = new Humano(13);
    Humano Ezequiel = new Humano(20);
    Mascota Gollum = new Mascota(13000);
    Mascota Olivia = new Mascota(13);
    Mascota Eva = new Mascota(13);
    casa1.ponerChimenea();
    casa1.añadirHabitantes(Martin);
    casa1.añadirHabitantes(Melina);
    casa2.añadirHabitantes(Gollum);
    casa2.añadirHabitantes(Olivia);
    departamento1.añadirHabitantes(Ezequiel);
//    casa1.añadirHabitantes(Eva);
        System.out.println(viejitoPasquaero.domicilioAburrido(casa2));
    //punto 1
    try {
        viejitoPasquaero.añadirAvisitar(casa1);
        } catch (DomicilioException e) {
        System.out.println("No se pudo añadir porque: " + e.getMessage());
    }
        System.out.print(" ");
        viejitoPasquaero.visitarDomicilio(casa1);
    // Putno 2 Regala al primero
        try {
            viejitoPasquaero.regalarAlPrimero();
        } catch (VacioException e) {
            System.out.println("No se pudo por que" + e.getMessage());
        }
// PUnto 3
        viejitoPasquaero.añadirAvisitar(casa2);
        viejitoPasquaero.añadirAvisitar(departamento1);
        viejitoPasquaero.visitarDomicilio(casa2);
        System.out.println(viejitoPasquaero.aburridoYYaVisitados());
        System.out.println(viejitoPasquaero.aburridoYNoVisitados());
    }
    }
