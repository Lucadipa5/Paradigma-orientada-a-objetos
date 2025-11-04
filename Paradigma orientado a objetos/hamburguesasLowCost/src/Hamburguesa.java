import java.util.ArrayList;

public class Hamburguesa {
    private Pan pan;
    private ArrayList<Medallon> medallones = new ArrayList<>();
    private ArrayList<Adicional> adicionales = new ArrayList<>();
    private boolean isFacturable;

    public Hamburguesa(Pan pan) {
        this.pan = pan;
    }

    public Pan getPan() {
        return pan;
    }

    public void setAdicionales(Adicional adicional){
        adicionales.add(adicional);
    }
    public void setMedallones(Medallon medallon){
        medallones.add(medallon);
    }
    
    public int getPrecioHamburguesa(){
        return  pan.getPrecio() + getPrecioMedallones() + getPrecioAdicionales();
    }
    public int getPrecioMedallones(){
        int precio = 0;
        for (Medallon medallon : medallones) {
            precio += medallon.getPrecio();
        }
        return precio;
    }
    public int getPrecioAdicionales(){
        int precio = 0;
        for (Adicional adicional : adicionales) {
            precio += adicional.getPrecio();
        }
        return precio;
    }

    public boolean isFacturable() {
        return (medallones.size()>1 && medallones.size() > adicionales.size());
    }
}
