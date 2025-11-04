public class TicketB3 extends Ticket{
    private int contadorConciertos;

    public TicketB3() {
        this.contadorConciertos = 0;
    }

    @Override
    public boolean entradaValida(Artista artista) {
        return (3 > getContadorConciertos());
    }
    @Override
    public void verArtista(Artista artista){
        super.verArtista(artista);
        this.contadorConciertos ++;
    }


    public int getContadorConciertos() {
        return contadorConciertos;
    }
}
