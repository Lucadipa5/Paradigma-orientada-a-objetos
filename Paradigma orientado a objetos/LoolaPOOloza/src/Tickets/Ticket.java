package Tickets;
import Artista.Artista;

public abstract class Ticket {

    public abstract boolean puedeEntrar(Artista artista);

    public abstract void verBanda(Artista artista);
}
