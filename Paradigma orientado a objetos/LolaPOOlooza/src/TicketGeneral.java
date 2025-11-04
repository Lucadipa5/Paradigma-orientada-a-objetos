public class TicketGeneral extends Ticket{
    private String diaAsociado;

    public TicketGeneral(String diaAsociado) {
        this.diaAsociado = diaAsociado;
    }

    @Override
    public boolean entradaValida(Artista artista ) {
        return (artista.getDiaQueToca().equalsIgnoreCase(getDiaAsociado()));
    }


    public String getDiaAsociado() {
        return diaAsociado;
    }
}
