import java.util.HashSet;

public class TicketCustom extends Ticket{
    private HashSet<Artista> listaArtitas = new HashSet<>();
    @Override
    public boolean entradaValida(Artista artista) {
        return (listaArtitas.contains(artista));
    }
    public void añadirArtista(Artista artista){
        listaArtitas.add(artista);
    }
}
