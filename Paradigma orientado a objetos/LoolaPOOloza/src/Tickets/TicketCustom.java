package Tickets;

import java.util.HashSet;
import Artista.Artista;

public class TicketCustom extends Ticket {
    private HashSet<Artista> artistas = new HashSet<>();

    public void agregarArtista(Artista artista){
        artistas.add(artista);
    }

    @Override
    public boolean puedeEntrar(Artista artista) {
        boolean puede = false;
        for (Artista artista1 : artistas) {
            if (artista1.getDia().equalsIgnoreCase(artista.getDia())) {
                puede = true;
                artista.
            }
        }
        return puede;
    }
}