import java.util.HashSet;

public class Casa extends Domicilio{
    private boolean tieneChimenea;

    public Casa(int numero, boolean tieneChimenea) {
        super(numero);
        this.tieneChimenea = tieneChimenea;
    }


    public void ponerChimenea(){
        this.tieneChimenea = true;
    }

    public void sacarChimenea(){
        this.tieneChimenea = false;
    }

}
