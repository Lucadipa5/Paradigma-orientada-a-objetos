package Tickets;
import Artista.Artista;

public class TicketB3 extends Ticket {
    private int contadorBandas;

    public TicketB3() {
        this.contadorBandas = 3;
    }

    public void verBanda(Artista artista){
        contadorBandas--;
        if (puedeEntrar(artista)){
            artista.sumarPublico();
        }
    }
    @Override
    public boolean puedeEntrar(Artista artista) {
        return (contadorBandas > 0);
    }
}
