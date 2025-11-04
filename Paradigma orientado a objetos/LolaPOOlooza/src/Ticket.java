public abstract class Ticket {

    protected abstract boolean entradaValida(Artista artista);
    public void verArtista(Artista artista){
        if(entradaValida(artista)){
        artista.sumarAsistentes();
    }
    };
}
