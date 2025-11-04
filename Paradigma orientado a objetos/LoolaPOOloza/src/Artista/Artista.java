package Artista;


public class Artista {
    private Escenario escenario;
    private String dia;
    private int cantidadDePublico;

    public Artista(Escenario escenario, String dia) {
        this.escenario = escenario;
        this.dia = dia;
        this.cantidadDePublico = 0;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public String getDia() {
        return dia;
    }

    public int getCantidadDePublico() {
        return cantidadDePublico;
    }
    public void sumarPublico(){
        cantidadDePublico++;
    }
}
