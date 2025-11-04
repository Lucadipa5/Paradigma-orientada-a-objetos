//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Barrio villaLaAngostura = new Barrio();

        Casa Campana = new Casa(568, true);
        Persona Merlina = new Persona(10,Campana);
        Persona Martin = new Persona(17,Campana);
        Mascota Eva = new Mascota(10,Campana);
        Mascota Olivia = new Mascota(10,Campana);
        Mascota Gollum = new Mascota(10,Campana);
        PapaNoel papaNoel = new PapaNoel();


        System.out.println(Merlina.mereceRegalo());
        papaNoel.recibeRegalo(Merlina);
        System.out.println((papaNoe);




    }
}