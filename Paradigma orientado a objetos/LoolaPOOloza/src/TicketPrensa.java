import Artista.Artista;
import Tickets.Ticket;

public class TicketPrensa extends Ticket {

    @Override
    public boolean puedeEntrar(Artista artista) {
        return  artista.getEscenario().isPuedePrensa();
    }
}
