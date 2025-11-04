package Tickets;
import Artista.Artista;

public class TicketsPorDia extends Ticket{
    private String diaAsignado;

    public TicketsPorDia(String diaAsignado) {
        this.diaAsignado = diaAsignado;
    }

    @Override
    public boolean puedeEntrar(Artista artista) {
        return (this.diaAsignado.equalsIgnoreCase(artista.getDia()));
    }

    @Override
    public void verBanda(Artista artista) {
        if(puedeEntrar(artista)){
            artista.sumarPublico();
        }
    }


}
