public class TicketB7 extends TicketB3{

    public TicketB7() {
        super();
    }

    @Override
    public boolean entradaValida(Artista artista) {
        return (7 > getContadorConciertos());
    }
}
