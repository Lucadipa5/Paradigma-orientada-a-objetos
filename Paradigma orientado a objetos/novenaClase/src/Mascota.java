public class Mascota extends Habitante{
    public Mascota(int edad, Domicilio domicilio) {
        super(edad, domicilio);
    }

    public boolean mereceRegalo(){
        return true;
    }
}
