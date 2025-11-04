public class TicketDePrensa extends Ticket {
    @Override
    public boolean entradaValida(Artista artista) {
        return artista.getDondeToca().isTieneLugarDePrensa();
    }
}
