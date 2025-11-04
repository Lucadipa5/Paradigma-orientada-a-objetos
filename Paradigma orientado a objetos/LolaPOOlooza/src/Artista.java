public class Artista {
    private int cantAsistentes;
    private String diaQueToca;
    private Escenario dondeToca;

    public Artista(String diaQueToca, Escenario dondeToca) {
        this.diaQueToca = diaQueToca;
        this.dondeToca = dondeToca;
    }

    public int getCantAsistentes() {
        return cantAsistentes;
    }

    public String getDiaQueToca() {
        return diaQueToca;
    }

    public Escenario getDondeToca() {
        return dondeToca;
    }
    public void sumarAsistentes(){
        this.cantAsistentes++;
    }
}
