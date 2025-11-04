import Artista.Artista;
import Tickets.Ticket;

public class TicketPlus extends Ticket {
    @Override
    public boolean puedeEntrar(Artista artista) {
        return true;
    }
}
