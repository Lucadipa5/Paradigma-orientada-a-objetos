import java.util.ArrayList;

public class Hamburguesa {
    private Pan pan;
    private ArrayList<Medallon> medallones = new ArrayList<Medallon>();
    private ArrayList<Adicional> adicionales = new ArrayList<Adicional>();

    public void agregarPan(Pan pan) {
        this.pan = pan;
    }

    public void agregarMedallon(Medallon medallon){
        medallones.add(medallon);
    }
    public void agregarAdcional(Adicional adicional){
        adicionales.add(adicional);
    }
    public Boolean Facturable(){
        return(pan !=  null && medallones.size()>=1 && (adicionales.size()<= medallones.size()));
    }
    public int precioBase(){
        return((medallones.get(0).getPrecio())+pan.getPrecio());
    };
    public int precio(){
        int suma = 0;
        return precioMedallones(suma)+precioAdicionales(suma)+pan.getPrecio();

    }

    private int precioMedallones(int suma) {
        for (Medallon medallone : medallones) {
            suma += medallone.getPrecio();
        }
        return suma;
    }

    private int precioAdicionales(int suma) {
        for (Adicional adicional : adicionales) {
            suma += adicional.getPrecio();
        }
        return suma;
    }

    ;

}
