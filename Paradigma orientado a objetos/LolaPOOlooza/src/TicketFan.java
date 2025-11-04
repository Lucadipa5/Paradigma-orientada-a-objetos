public class TicketFan extends Ticket{
    private Artista artistaFan;

    public TicketFan(Artista artistaFan) {
        this.artistaFan = artistaFan;
    }

    @Override
    public boolean entradaValida(Artista artista) {
        return artista.equals(getArtistaFan());
    }

    public Artista getArtistaFan() {
        return artistaFan;
    }
}
