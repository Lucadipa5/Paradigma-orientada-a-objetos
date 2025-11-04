import Artista.Artista;
import Artista.Escenario;
import Tickets.TicketB3;
import Tickets.TicketFan;
import Tickets.TicketsPorDia;

public class Main {
    public static void main(String[] args) {
    TicketsPorDia viernes = new TicketsPorDia("Viernes");
    TicketB3 banda3 = new TicketB3();
    Escenario escenario1 = new Escenario(true);
    Escenario escenario2 = new Escenario(false);
    Artista Prince = new Artista(escenario1,"Viernes");
    Artista Drake = new Artista(escenario1,"Sabado");
    Artista Airbag = new Artista(escenario2,"Domingo");

        System.out.println(viernes.puedeEntrar(Drake));
        System.out.println(viernes.puedeEntrar(Prince));
        System.out.println(banda3.puedeEntrar(Prince));
    banda3.verBanda();
    banda3.verBanda();
    banda3.verBanda();
        System.out.println(banda3.puedeEntrar(Drake));
        TicketFan fanDePrince = new TicketFan(Prince);
        System.out.println(fanDePrince.puedeEntrar(Drake));
        System.out.println(fanDePrince.puedeEntrar(Prince));
    TicketPrensa bebeContempone = new TicketPrensa();
        System.out.println(bebeContempone.puedeEntrar(Prince));
        System.out.println(bebeContempone.puedeEntrar(Airbag));
        System.out.println(bebeContempone.puedeEntrar(Drake));

    }
}