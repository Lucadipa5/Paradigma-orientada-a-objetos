import java.util.HashSet;

public abstract class  Actividades {
protected Ciudad ciudadDondeSeRealiza;
protected boolean sePuedeRealizar;

    public Ciudad getCiudadDondeSeRealiza() {
        return ciudadDondeSeRealiza;
    }

    public void setCiudadDondeSeRealiza(Ciudad ciudadDondeSeRealiza) {
        this.ciudadDondeSeRealiza = ciudadDondeSeRealiza;
    }
}
