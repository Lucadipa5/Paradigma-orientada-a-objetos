package Tickets;
import Artista.Artista;

public class TicketFan extends Ticket {
    private Artista artistaAsociado;

    public TicketFan(Artista artistaAsociado) {
        this.artistaAsociado = artistaAsociado;
    }

    @Override
    public boolean puedeEntrar(Artista artista) {
        return (artista.equals(this.artistaAsociado));
    }
}
